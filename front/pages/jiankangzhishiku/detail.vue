

<template>
<view>
<mescroll-uni @init="mescrollInit" :up="upOption" :down="downOption" @down="downCallback" @up="upCallback">
	<view class="content">
		<view class="container" :style='{"minHeight":"100vh","width":"100%","padding":"0 24rpx 24rpx","position":"relative","background":"#eefcff","height":"auto"}'>
						<swiper :style='{"top":"48rpx","left":"48rpx","background":"none","width":"200rpx","position":"absolute","height":"200rpx","zIndex":"9"}' class="swiper" :indicator-dots='false' :autoplay='true' :circular='false' indicator-active-color='#000000' indicator-color='rgba(0, 0, 0, .3)' :duration='500' :interval='6000' :vertical='false'>
				<swiper-item :style='{"width":"100%","borderRadius":"100%","background":"none","height":"100%"}' v-for="(swiper,index) in swiperList" :key="index">
					<image :style='{"width":"100%","objectFit":"cover","borderRadius":"100%","background":"none","display":"block","height":"100%"}' mode="aspectFill" v-if="swiper.substring(0,4)=='http'" :src="swiper"></image>
					<image :style='{"width":"100%","objectFit":"cover","borderRadius":"100%","background":"none","display":"block","height":"100%"}' mode="aspectFill" v-else :src="baseUrl+swiper"></image>
				</swiper-item>
			</swiper>
												            <view :style='{"padding":"260rpx 0 0","margin":"0 0 0","flexWrap":"wrap","background":"none","display":"flex","width":"100%","position":"relative","justifyContent":"space-between","height":"auto"}' class="detail-content">
				<view :style='{"width":"50%","padding":"0","borderColor":"#76c4d8","borderStyle":"solid","textAlign":"right","borderWidth":"0 0 2rpx"}' v-if="storeupFlag==1" @click="shoucang">
					<text class="icon iconfont icon-shoucang11" :style='{"margin":"0 4rpx 0 0","lineHeight":"76rpx","fontSize":"36rpx","color":"#f15b12"}'></text>
					<text :style='{"color":"#f15b12","lineHeight":"76rpx","fontSize":"28rpx"}'>collect</text>
				</view>
				<view :style='{"borderColor":"#76c4d8","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto","order":"2"}' v-if="storeupFlag==0" @click="shoucang">
					<text class="icon iconfont icon-shoucang11" :style='{"margin":"0 4rpx 0 0","lineHeight":"76rpx","fontSize":"36rpx","color":"#f15b12"}'></text>
					<text :style='{"color":"#f15b12","lineHeight":"76rpx","fontSize":"28rpx"}'>collect</text>
				</view>

				<view :style='{"padding":"0 24rpx 0px","margin":"0","borderColor":"#76c4d8","borderRadius":"0","borderWidth":"0 0 0px 0","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="detail-list-item title">
					<view :style='{"padding":"0 20rpx 0 0","borderColor":"#76c4d8","color":"#333","borderRadius":"0","textAlign":"right","borderWidth":"0 0 2rpx","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="lable">user information：</view>
					<view :style='{"padding":"0px","margin":"0px","borderColor":"#76c4d8","color":"#666","borderWidth":"0 0 2rpx","flex":"1","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="text">{{detail.zhishimingcheng}}</view>
				</view>
				<view :style='{"padding":"0 24rpx 0px","margin":"0","borderColor":"#76c4d8","borderRadius":"0","borderWidth":"0 0 0px 0","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="detail-list-item title">
					<view :style='{"padding":"0 20rpx 0 0","borderColor":"#76c4d8","color":"#333","borderRadius":"0","textAlign":"right","borderWidth":"0 0 2rpx","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="lable">knowledge type：</view>
					<view :style='{"padding":"0px","margin":"0px","borderColor":"#76c4d8","color":"#666","borderWidth":"0 0 2rpx","flex":"1","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="text">{{detail.zhishileixing}}</view>
				</view>

				<view class="detail-list-item" :style='{"padding":"0 24rpx 0px","margin":"0","borderColor":"#76c4d8","borderRadius":"0","borderWidth":"0 0 0px 0","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","borderColor":"#76c4d8","color":"#333","borderRadius":"0","textAlign":"right","borderWidth":"0 0 2rpx","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}'>Release time：</view>
					<view  class="text" :style='{"padding":"0px","margin":"0px","borderColor":"#76c4d8","color":"#666","borderWidth":"0 0 2rpx","flex":"1","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}'>{{detail.fabushijian}}</view>
				</view>
				<view class="detail-list-item" :style='{"padding":"0 24rpx 0px","margin":"0","borderColor":"#76c4d8","borderRadius":"0","borderWidth":"0 0 0px 0","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","borderColor":"#76c4d8","color":"#333","borderRadius":"0","textAlign":"right","borderWidth":"0 0 2rpx","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}'>Number of comments：</view>
					<view  class="text" :style='{"padding":"0px","margin":"0px","borderColor":"#76c4d8","color":"#666","borderWidth":"0 0 2rpx","flex":"1","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}'>{{detail.discussnum}}</view>
				</view>
				<view class="detail-list-item" :style='{"padding":"0 24rpx 0px","margin":"0","borderColor":"#76c4d8","borderRadius":"0","borderWidth":"0 0 0px 0","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","borderColor":"#76c4d8","color":"#333","borderRadius":"0","textAlign":"right","borderWidth":"0 0 2rpx","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}'>Number of Collections：</view>
					<view  class="text" :style='{"padding":"0px","margin":"0px","borderColor":"#76c4d8","color":"#666","borderWidth":"0 0 2rpx","flex":"1","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}'>{{detail.storeupnum}}</view>
				</view>

				<view :style='{"padding":"0 40rpx","margin":"24rpx 0 24rpx 0","borderColor":"#ccc","textAlign":"center","display":"inline-block","minWidth":"40%","float":"left","borderRadius":"60rpx","borderWidth":"0 0 0px 0","background":"#76c4d8","width":"auto","borderStyle":"solid","height":"auto","order":"6"}' class="detail-list-item" v-if="!thumbsupFlag&&!crazilyFlag" @tap="zan">
					<view :style='{"padding":"0 10rpx 0 0","color":"#fff","display":"inline-block","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"500"}' class="lable">like：</view>
					<view :style='{"width":"auto","flex":"1","justifyContent":"space-between","display":"inline-block","height":"auto"}'>
						<view :style='{"color":"#fff","lineHeight":"80rpx","fontSize":"28rpx"}'>{{detail.thumbsupnum}}</view>
						<view :style='{"lineHeight":"80rpx","fontSize":"28rpx","color":"#333","display":"none"}' class="cuIcon-appreciate"></view>
					</view>
				</view>
				<view :style='{"padding":"0 40rpx","margin":"24rpx 0 24rpx 0","borderColor":"#ccc","textAlign":"center","display":"inline-block","minWidth":"40%","float":"left","borderRadius":"60rpx","borderWidth":"0 0 0px 0","background":"#76c4d8","width":"auto","borderStyle":"solid","height":"auto","order":"6"}' class="detail-list-item" v-if="thumbsupFlag" @tap="zan">
					<view :style='{"padding":"0 10rpx 0 0","color":"#fff","display":"inline-block","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"500"}' class="lable">liked：</view>
					<view :style='{"width":"auto","flex":"1","justifyContent":"space-between","display":"inline-block","height":"auto"}'>
						<view :style='{"color":"#fff","lineHeight":"80rpx","fontSize":"28rpx"}'>{{detail.thumbsupnum}}</view>
						<view :style='{"lineHeight":"80rpx","fontSize":"28rpx","color":"#333","display":"none"}' class="cuIcon-appreciate"></view>
					</view>
				</view>
				<view :style='{"padding":"0 40rpx","margin":"24rpx 0 24rpx 0","borderColor":"#c4c4c4","textAlign":"center","display":"inline-block","minWidth":"40%","float":"right","borderRadius":"60rpx","borderWidth":"0px","background":"#76c4d8","width":"auto","borderStyle":"solid","height":"auto","order":"7"}' class="detail-list-item" v-if="!thumbsupFlag&&!crazilyFlag" @tap="cai">
					<view :style='{"width":"auto","padding":"0 10rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#fff","display":"inline-block"}' class="lable">dislike：</view>
					<view :style='{"width":"auto","flex":"1","justifyContent":"space-between","display":"inline-block","height":"auto"}'>
						<view :style='{"color":"#fff","lineHeight":"80rpx","fontSize":"28rpx"}'>{{detail.crazilynum}}</view>
						<view style="transform: rotate(180deg);" :style='{"lineHeight":"80rpx","fontSize":"28rpx","color":"#fff","display":"none"}' class="cuIcon-appreciate"></view>
					</view>
				</view>
				<view :style='{"padding":"0 40rpx","margin":"24rpx 0 24rpx 0","borderColor":"#c4c4c4","textAlign":"center","display":"inline-block","minWidth":"40%","float":"right","borderRadius":"60rpx","borderWidth":"0px","background":"#76c4d8","width":"auto","borderStyle":"solid","height":"auto","order":"7"}' class="detail-list-item" v-if="crazilyFlag" @tap="cai">
					<view :style='{"width":"auto","padding":"0 10rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#fff","display":"inline-block"}' class="lable">dislike：</view>
					<view :style='{"width":"auto","flex":"1","justifyContent":"space-between","display":"inline-block","height":"auto"}'>
						<view :style='{"color":"#fff","lineHeight":"80rpx","fontSize":"28rpx"}'>{{detail.crazilynum}}</view>
						<view style="transform: rotate(180deg);" :style='{"lineHeight":"80rpx","fontSize":"28rpx","color":"#fff","display":"none"}' class="cuIcon-appreciate"></view>
					</view>
				</view>

				<view class="detail-list-item video" :style='{"margin":"0 0 24rpx 0","borderColor":"#ccc","borderRadius":"40rpx","borderWidth":"0 0 2rpx 0","display":"flex","width":"100%","borderStyle":"solid","height":"auto","order":"5"}'>
					<video :style='{"border":"0","width":"100%","margin":"0","borderRadius":"40rpx","display":"block"}' id="myVideo" :src="baseUrl+detail.zhishishipin" controls></video>
				</view>



				<view class="detail-list-item rich" :style='{"padding":"24rpx","boxShadow":"0 8rpx 8rpx #76c4d820","margin":"0 0 24rpx 0","borderColor":"#d8d8d8","borderRadius":"0 0 40rpx 40rpx","borderWidth":"0 0 0px 0","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"48rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>Knowledge Introduction：</view>
					<view class="rich-text" :style='{"padding":"0px 24rpx 24rpx 0","margin":"0","lineHeight":"48rpx","color":"#666","flex":"1"}'>
						<rich-text :nodes="detail.zhishijianjie"></rich-text>
					</view>
				</view>


				<view class="time-content" :style='{"padding":"0","margin":"24rpx 0 24rpx 0","borderRadius":"40rpx","background":"none","width":"100%","height":"auto","order":"11"}'>
					<view class="comoment-header" :style='{"borderColor":"#76c4d8","borderRadius":"0px","background":"none","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","justifyContent":"space-between","height":"auto"}'>
						<view :style='{"padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333"}'>Comments</view>
						<view :style='{"padding":"0 40rpx 0 20rpx","borderRadius":"0 60rpx 60rpx 0","background":"none","display":"flex"}' @click="onCommentTap" class="btn-comment-content" style="display: flex;align-items: center;">
							<view :style='{"margin":"0 8rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#76c4d8"}' class="cuIcon-add"></view>
							<view :style='{"color":"#76c4d8","lineHeight":"80rpx","fontSize":"28rpx"}'>Add Comment</view>
						</view>
					</view>
				
					<view :style='{"padding":"24rpx","margin":"24rpx 0 0 0","borderColor":"#76c4d8","borderRadius":"0px","background":"none","borderWidth":"0 0 2rpx","width":"100%","borderStyle":"dotted","height":"auto"}' v-for="(item,index) in commentList" v-bind:key="index" class="cu-item comment-item">
						<view :style='{"width":"100%","display":"flex","height":"auto"}'>
							<image :style='{"width":"60rpx","margin":"0 8rpx 0 0","borderRadius":"100%","display":"block","height":"60rpx"}' v-if="item.avatarurl" mode="aspectFill" :src="baseUrl+item.avatarurl"></image>
							<view :style='{"color":"#333","lineHeight":"60rpx","fontSize":"28rpx"}' class="text-grey">{{item.nickname}}</view>
						</view>
						<view :style='{"margin":"8rpx 0","lineHeight":"1.5","fontSize":"28rpx","color":"#666","textIndent":"2em"}' class="text-gray text-content text-df">
							<view v-html="item.content"></view>
						</view>
						<view :style='{"lineHeight":"48rpx","fontSize":"26rpx","color":"#999","textAlign":"right"}' class="margin-top-sm text-gray text-df">{{item.addtime}}</view>
						<view v-if="item.reply" :style='{"margin":"8rpx 0","lineHeight":"1.5","fontSize":"28rpx","color":"#666","textIndent":"2em"}' class="text-gray text-content text-df">
							回复:{{item.reply}}
						</view>
						<view style="display: flex;display: flex;justify-content: flex-end;padding: 6rpx 0;" v-if="user&&user.id==item.userid">
							<view style="color: #999;font-size: 16rpx;" @click="delClick(item.id)">delete</view>
						</view>
					</view>
				</view>

				<view class="bottom-content bg-white tabbar border shop" :style='{"padding":"24rpx 0","margin":"0 auto","borderRadius":"0","flexWrap":"wrap","background":"none","display":"flex","width":"100%","height":"auto","order":"2"}'>

					
				</view>
			</view>

		</view>
	</view>
</mescroll-uni>
</view>
</template>

<script>
	export default {
		data() {
			return {
				btnColor: ['#409eff','#67c23a','#909399','#e6a23c','#f56c6c','#356c6c','#351c6c','#f093a9','#a7c23a','#104eff','#10441f','#a21233','#503319'],
				id: '',
                userid: '',
				detail: {},
				swiperList: [],
				commentList: [],
				mescroll: null, //mescroll实例对象
				downOption: {
					auto: false //是否在初始化后,自动执行下拉回调callback; 默认true
				},
				upOption: {
					noMoreSize: 3, //如果列表已无数据,可设置列表的总数量要大于半页才显示无更多数据;避免列表数据过少(比如只有一条数据),显示无更多数据会不好看; 默认5
					textNoMore: '~ 没有更多了 ~',
				},
				hasNext: true,
				user: {},
				storeupFlag: 0,
				thumbsupFlag: 0,
				crazilyFlag: 0,
				count: 0,
				timer: null,
				title:'',
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		async onLoad(options) {
			// #ifdef APP-PLUS
			let page = getCurrentPages()
			this.href = this.baseUrl + 'front/h5/#/' + page[page.length - 1].route
			// #endif
			this.id = options.id;
            if(options.userid) {
                this.userid = options.userid;
            }
			// 渲染数据
			this.init();
		},
		// #ifdef MP-WEIXIN
		onShareAppMessage(){
			var obj = {
				title: this.title,
				imageUrl: this.swiperList[0]?this.baseUrl + this.swiperList[0]: ''
			}
			return obj
		},
		// #endif
        onUnload() {
            if(this.timer) {
                clearInterval(this.timer);
            }
        },
		async onShow(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			this.btnColor = this.btnColor.sort(()=> {
				return (0.5-Math.random());
			});
			this.getStoreup();
			this.getThumbsup();
			let cleanType = uni.getStorageSync('discussjiankangzhishikuCleanType')
			if(cleanType){
				uni.removeStorageSync('discussjiankangzhishikuCleanType')
				this.mescroll.num = 1
				this.upCallback(this.mescroll)
				this.init();
			}
			let crossCleanType = uni.getStorageSync('crossCleanType')
            if(crossCleanType) {
				uni.removeStorageSync('crossCleanType')
                res = await this.$api.info('jiankangzhishiku', this.id);
                this.detail = res.data;
				this.title = this.detail.zhishimingcheng
            }
		},
		destroyed: function() {
			//window.clearInterval(this.inter);
		},
		methods: {
			// 支付
			onPayTap(){
				if(!this.user){
					return false
				}
				uni.setStorageSync('paytable','jiankangzhishiku');
				uni.setStorageSync('payObject',this.detail);
				this.$utils.jump('../pay-confirm/pay-confirm?type=1')
			},
            onDetailTap(item) {
                uni.setStorageSync("useridTag",this.userid);
                this.$utils.jump(`./detail?id=${item.id}&userid=`+this.userid)
            },
			// 收藏
			async getStoreup() {
				if(!this.user){
					return false
				}
				let params = {
					page: 1,
					limit: 1,
					refid : this.id,
					tablename : 'jiankangzhishiku',
					userid: this.user.id,
					type: 1,
				}
				let res = await this.$api.list(`storeup`, params);
				this.storeupFlag = res.data.list.length;
			},
			async shoucang(){
				if(!this.user){
					return false
				}
				let _this = this;
				let params = {
					page: 1,
					limit: 1,
					refid : _this.detail.id,
					tablename : 'jiankangzhishiku',
					userid: _this.user.id,
					type: 1,
				}
				let res = await _this.$api.list(`storeup`, params);
				if (res.data.list.length == 1) {
					let storeupId = res.data.list[0].id;
					uni.showModal({
						title: '提示',
						content: '是否取消',
						success: async function(res) {
							if (res.confirm) {
								_this.detail.storeupnum--
								await _this.$api.update('jiankangzhishiku',_this.detail)
								await _this.$api.del('storeup', JSON.stringify([storeupId]));
								_this.$utils.msg('取消成功');
								_this.getStoreup();
							}
						}
					});
					return;
				}
				uni.showModal({
					title: '提示',
					content: '是否收藏',
					success: async function(res) {
						if (res.confirm) {
							await _this.$api.add('storeup', {
								userid: _this.user.id,
								name: _this.detail.zhishimingcheng,
								picture: _this.swiperList[0],
								refid: _this.detail.id,
								tablename: 'jiankangzhishiku',
                                type: 1
							});
							_this.detail.storeupnum++
							await _this.$api.update('jiankangzhishiku',_this.detail)
							_this.$utils.msg('收藏成功');
							_this.getStoreup();
						}
					}
				});
			},
			// 跨表
			onAcrossTap(tableName,crossOptAudit,statusColumnName,tips,statusColumnValue){
				if(!this.user){
					return false
				}
				uni.setStorageSync('crossTable','jiankangzhishiku');
				uni.setStorageSync(`crossObj`, this.detail);
				uni.setStorageSync(`statusColumnName`, statusColumnName);
				uni.setStorageSync(`statusColumnValue`, statusColumnValue);
				uni.setStorageSync(`tips`, tips);
				if(statusColumnName!=''&&!statusColumnName.startsWith("[")) {
					var obj = uni.getStorageSync('crossObj');
					for (var o in obj){
						if(o==statusColumnName && obj[o]==statusColumnValue){
							this.$utils.msg(tips);
							return
						}
					}
				}
				this.$utils.jump(`../${tableName}/add-or-update?cross=true`);
			},
			// 获取详情
			async init(){
                if(this.timer) {
                    clearInterval(this.timer);
                }
				let res = await this.$api.info('jiankangzhishiku', this.id);
				this.detail = res.data;

				this.title = this.detail.zhishimingcheng
				//修改富文本的图片样式
				this.detail.zhishijianjie = this.detail.zhishijianjie.replace(/img src/gi,"img style=\"width:100%;\" src");
				// 轮播图片
				this.swiperList = this.detail.zhishitupian ? this.detail.zhishitupian.split(",") : [];
				

			},

			// mescroll组件初始化的回调,可获取到mescroll对象
			mescrollInit(mescroll) {
				this.mescroll = mescroll;
			},

			/*下拉刷新的回调 */
			downCallback(mescroll) {
				this.hasNext = true
				mescroll.resetUpScroll()
			},

			/*上拉加载的回调: mescroll携带page的参数, 其中num:当前页 从1开始, size:每页数据条数,默认10 */
			async upCallback(mescroll) {
                let res = await this.$api.list('discussjiankangzhishiku', {
					page: mescroll.num,
					limit: 10,
					refid: this.id
				});
				// 如果是第一页数据置空
				if (mescroll.num == 1) this.commentList = [];
				this.commentList = this.commentList.concat(res.data.list);
				if (res.data.list.length == 0) this.hasNext = false;
				mescroll.endSuccess(mescroll.size, this.hasNext);

            },



			onChatTap() {
				this.$utils.jump('../chat/chat')
			},
			// 下载
			download(url){
				let _this = this;
				url=_this.$base.url +  url;
				uni.downloadFile({
					url: url,
					success: (res) => {
						if (res.statusCode === 200) {
							_this.$utils.msg('下载成功');
							 window.open(url);
						}
					}
				});
			},
			//
			onCartTabTap() {
				this.$utils.tab('../shop-cart/shop-cart')
			},
			// 添加评论
			async onCommentTap() {
				if(!this.user){
					return false
				}
				this.$utils.jump(`../discussjiankangzhishiku/add-or-update?refid=${this.id}`)
			},
			delClick(id){
				let that = this
				uni.showModal({
					title: 'prompt',
					content: 'Do you want to delete this comment？',
					async success(res) {
						if(res.confirm){
							await that.$api.del('discussjiankangzhishiku',JSON.stringify([id]))
							that.$utils.msg('Delete successful')
							that.detail.discussnum--
							await that.$api.update('jiankangzhishiku',that.detail)
							setTimeout(()=>{
								that.upCallback(that.mescroll)
							},1500)
						}
					}
				})
			},
			// 获取赞踩
			async getThumbsup() {
				if(!this.user){
					return false
				}
				let params = {
					page: 1,
					limit: 1,
					refid: this.id,
					tablename: 'jiankangzhishiku',
					userid: this.user.id,
					type: '%2%',
				}
				let res = await this.$api.list(`storeup`, params);
				if (res.data.list.length > 0) {
					if(res.data.list[0].type=='21') {
						this.thumbsupFlag = 1;
					} else {
						this.crazilyFlag = 1;
					}
				}

			},
			// 点赞
			async zan() {
				if(!this.user){
					return false
				}
				let _this = this;
				let params = {
					page: 1,
					limit: 1,
					refid: _this.detail.id,
					tablename : 'jiankangzhishiku',
					userid: _this.user.id,
					type: '%2%',
				}
				let res = await _this.$api.list(`storeup`, params);
				if (res.data.list.length > 0) {
					let storeupId = res.data.list[0].id;
					uni.showModal({
						title: '提示',
						content: '是否取消点赞',
						success: async function(res) {
							if (res.confirm) {
								await _this.$api.del('storeup', JSON.stringify([storeupId]));
								_this.detail.thumbsupnum = parseInt(_this.detail.thumbsupnum) - 1;
								await _this.$api.update('jiankangzhishiku', _this.detail);
								_this.$utils.msg('取消成功');
								_this.thumbsupFlag=0;
							}
						}
					});
					return;
				}
				uni.showModal({
					title: '提示',
					content: '是否点赞',
					success: async function(res) {
						if (res.confirm) {
							await _this.$api.add('storeup', {
								userid: _this.user.id,
                                name: _this.detail.zhishimingcheng,
								picture: _this.swiperList[0],
								refid: _this.detail.id,
								tablename: 'jiankangzhishiku',
								type: '21'
							});
							_this.detail.thumbsupnum = parseInt(_this.detail.thumbsupnum) + 1;
							await _this.$api.update('jiankangzhishiku', _this.detail);
							_this.$utils.msg('点赞成功');
							_this.thumbsupFlag=1;
						}
					}
				});
			},
			// 踩
			async cai() {
				if(!this.user){
					return false
				}
				let _this = this;
				let params = {
					page: 1,
					limit: 1,
					refid: _this.detail.id,
					tablename: 'jiankangzhishiku',
					userid: _this.user.id,
					type: '%2%',
				}
				let res = await _this.$api.list(`storeup`, params);
				if (res.data.list.length > 0) {
					let storeupId = res.data.list[0].id;
					uni.showModal({
						title: '提示',
						content: '是否取消点踩',
						success: async function(res) {
							if (res.confirm) {
								await _this.$api.del('storeup', JSON.stringify([storeupId]));
								_this.detail.crazilynum = parseInt(_this.detail.crazilynum) - 1;
								await _this.$api.update('jiankangzhishiku', _this.detail);
								_this.$utils.msg('取消成功');
								_this.crazilyFlag=0;
							}
						}
					});
					return;
				}
				uni.showModal({
					title: '提示',
					content: '是否点踩',
					success: async function(res) {
						if (res.confirm) {
							await _this.$api.add('storeup', {
								userid: _this.user.id,
                                name: _this.detail.zhishimingcheng,
								picture: _this.swiperList[0],
								refid: _this.detail.id,
								tablename: 'jiankangzhishiku',
								type: '22'
							});
							_this.detail.crazilynum = parseInt(_this.detail.crazilynum) + 1;
							await _this.$api.update('jiankangzhishiku', _this.detail);
							_this.$utils.msg('点踩成功');
							_this.crazilyFlag=1;
						}
					}
				});
			},
		}
	}
</script>

<style lang="scss">
	page {
	  --animate-duration: 1s;
	  --animate-delay: 1s;
	  --animate-repeat: 1;
	}
	
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
	
	.seat-list {
		display: flex;
		align-items: center;
		flex-wrap: wrap;
		background: #FFFFFF;
		margin: 20upx;
		border-radius: 20upx;
		padding: 20upx;
		font-size: 30upx;
		.seat-item {
			width: 33.33%;
			display: flex;
			align-items: center;
			flex-direction: column;
			margin-bottom: 20upx;
	
			.seat-icon {
				width: 50upx;
				height: 50upx;
				margin-bottom: 10upx;
			}
		}
	}
	
	audio {
		display: flex;
		flex-direction: column;
	}
	
	.audio /deep/ .uni-audio-default {
		width: inherit;
	}
	

</style>
