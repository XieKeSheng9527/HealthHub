<template>
<view class="content">
	<view class="box" :style='{"minHeight":"100vh","width":"100%","padding":"400rpx 24rpx 24rpx","background":"url(http://codegen.caihongy.cn/20231214/00b1632868ad4df5b6ac9b36b9a9a6c7.png) no-repeat center top / 100% auto,#fff","height":"auto"}'>
		<view :style='{"padding":"44rpx 44rpx 64rpx 24rpx","margin":"0 0 80rpx","borderRadius":"40rpx","textAlign":"center","background":"rgba(255,255,255,.6)","display":"block","width":"100%","position":"relative","height":"auto"}'>
			<image :style='{"width":"160rpx","margin":"0 auto 24rpx auto","borderRadius":"8rpx","display":"none","height":"160rpx"}' src="http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg" mode="aspectFill"></image>
			<view :style='{"margin":"0 0 0px 0","borderColor":"#349fbb","textAlign":"left","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"auto","lineHeight":"76rpx","fontSize":"28rpx","color":"#666","textAlign":"right","fontWeight":"500"}' class="label">user account：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"76rpx"}'  v-model="ruleForm.yonghuzhanghao"  type="text"  class="uni-input" name="" placeholder="user account
" />
			</view>
			<view :style='{"margin":"0 0 0px 0","borderColor":"#349fbb","textAlign":"left","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"auto","lineHeight":"76rpx","fontSize":"28rpx","color":"#666","textAlign":"right","fontWeight":"500"}' class="label">password：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"76rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="password" />
			</view>
			<view :style='{"margin":"0 0 0px 0","borderColor":"#349fbb","textAlign":"left","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"auto","lineHeight":"76rpx","fontSize":"28rpx","color":"#666","textAlign":"right","fontWeight":"500"}' class="label">Confirm password：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"76rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="Confirm password" />
			</view>
			<view :style='{"margin":"0 0 0px 0","borderColor":"#349fbb","textAlign":"left","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"auto","lineHeight":"76rpx","fontSize":"28rpx","color":"#666","textAlign":"right","fontWeight":"500"}' class="label">User Name：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"76rpx"}'  v-model="ruleForm.yonghuxingming"  type="text"  class="uni-input" name="" placeholder="User Name" />
			</view>
            <view :style='{"margin":"0 0 0px 0","borderColor":"#349fbb","textAlign":"left","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="">
				<view :style='{"width":"auto","lineHeight":"76rpx","fontSize":"28rpx","color":"#666","textAlign":"right","fontWeight":"500"}' class="label">gender：</view>
				<picker :style='{"width":"auto","margin":"0 0 0px 0","lineHeight":"76rpx","textAlign":"left","display":"flex","height":"76rpx"}' v-if="tableName=='yonghu'"  @change="yonghuxingbieChange" :value="yonghuxingbieIndex" :range="yonghuxingbieOptions">
					<view>
						<view :style='{"lineHeight":"88rpx","fontSize":"28rpx","color":"#888","textAlign":"left"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
					</view>
				</picker>
			</view>
			<view :style='{"margin":"0 0 0px 0","borderColor":"#349fbb","textAlign":"left","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"auto","lineHeight":"76rpx","fontSize":"28rpx","color":"#666","textAlign":"right","fontWeight":"500"}' class="label">age：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"76rpx"}'  v-model="ruleForm.nianling"  type="text"  class="uni-input" name="" placeholder="age" />
			</view>
			<view :style='{"margin":"0 0 0px 0","borderColor":"#349fbb","textAlign":"left","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"auto","lineHeight":"76rpx","fontSize":"28rpx","color":"#666","textAlign":"right","fontWeight":"500"}' class="label">height(cm)：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"76rpx"}'  v-model="ruleForm.shengao"  type="text"  class="uni-input" name="" placeholder="height(cm)" />
			</view>
			<view :style='{"margin":"0 0 0px 0","borderColor":"#349fbb","textAlign":"left","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"auto","lineHeight":"76rpx","fontSize":"28rpx","color":"#666","textAlign":"right","fontWeight":"500"}' class="label">weight(kg)：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"76rpx"}'  v-model="ruleForm.tizhong"  type="text"  class="uni-input" name="" placeholder="Weight (kg)" />
			</view>
			<view :style='{"margin":"0 0 0px 0","borderColor":"#349fbb","textAlign":"left","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"auto","lineHeight":"76rpx","fontSize":"28rpx","color":"#666","textAlign":"right","fontWeight":"500"}' class="label">phone：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"76rpx"}'  v-model="ruleForm.dianhua"  type="text"  class="uni-input" name="" placeholder="phone" />
			</view>
            <view :style='{"margin":"0 0 0px 0","borderColor":"#349fbb","textAlign":"left","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" @tap="yonghutouxiangTap" class="">
				<view :style='{"width":"auto","lineHeight":"76rpx","fontSize":"28rpx","color":"#666","textAlign":"right","fontWeight":"500"}' class="label">head sculpture：</view>
				<image :style='{"width":"160rpx","borderRadius":"8rpx","objectFit":"cover","display":"block","height":"80rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
                <image :style='{"width":"160rpx","borderRadius":"8rpx","objectFit":"cover","display":"block","height":"80rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<button :style='{"border":"0","padding":"0px","margin":"48rpx auto 24rpx","color":"rgb(255, 255, 255)","borderRadius":"60rpx","background":"#76c4d8","width":"60%","lineHeight":"88rpx","fontSize":"36rpx","height":"88rpx"}' class="btn-submit" @tap="register" type="primary">register</button>
			
			<view class="idea1" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea1</view>
			<view class="idea2" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea2</view>
			<view class="idea3" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea3</view>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
                yonghuxingbieOptions: [],
                yonghuxingbieIndex: 0,
				ruleForm: {
                yonghuzhanghao: '',
                mima: '',
                yonghuxingming: '',
                xingbie: '',
                nianling: '',
                shengao: '',
                tizhong: '',
                yinshixiguan: '',
                mubiaotizhong: '',
                jianshenmubiao: '',
                dianhua: '',
                touxiang: '',
				},
				tableName:""
			}
		},
        components: {
            multipleSelect
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
            this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='yonghu'){
                this.yonghuxingbieOptions = "male,female".split(',');
				this.ruleForm.xingbie=this.yonghuxingbieOptions[0]
			}
			
			this.styleChange()
		},
		methods: {

            // 下拉变化
            yonghuxingbieChange(e) {
                    this.yonghuxingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.yonghuxingbieOptions[this.yonghuxingbieIndex]
            },
            yonghutouxiangTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.touxiang = 'upload/' + res.file;
                    _this.$forceUpdate();
                });
            },
            toggleTab(str) {
                this.$refs[str].show();
            },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.yonghuzhanghao) && `yonghu` == this.tableName){
					this.$utils.msg(`用户账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`yonghu` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if((!this.ruleForm.yonghuxingming) && `yonghu` == this.tableName){
					this.$utils.msg(`用户姓名不能为空`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.dianhua&&(!this.$validate.isMobile(this.ruleForm.dianhua))){
					this.$utils.msg(`电话应输入手机格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
