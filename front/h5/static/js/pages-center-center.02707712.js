(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-center-center"],{"247f":function(e,t,n){"use strict";var i=n("2af4"),r=n.n(i);r.a},"27ae":function(e,t,n){"use strict";n.r(t);var i=n("55b4"),r=n.n(i);for(var a in i)"default"!==a&&function(e){n.d(t,e,(function(){return i[e]}))}(a);t["default"]=r.a},"2af4":function(e,t,n){var i=n("e90b");"string"===typeof i&&(i=[[e.i,i,""]]),i.locals&&(e.exports=i.locals);var r=n("4f06").default;r("dc662276",i,!0,{sourceMap:!1,shadowMode:!1})},"55b4":function(e,t,n){"use strict";var i=n("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,n("c5f6"),n("96cf");var r=i(n("3b8d")),a=i(n("2971")),o={data:function(){return{isH5Plus:!0,user:{},tableName:"",role:"",menuList:[],iconArr:["cuIcon-same","cuIcon-deliver","cuIcon-evaluate","cuIcon-shop","cuIcon-ticket","cuIcon-cascades","cuIcon-discover","cuIcon-question","cuIcon-pic","cuIcon-filter","cuIcon-footprint","cuIcon-pulldown","cuIcon-pullup","cuIcon-moreandroid","cuIcon-refund","cuIcon-qrcode","cuIcon-remind","cuIcon-profile","cuIcon-home","cuIcon-message","cuIcon-link","cuIcon-lock","cuIcon-unlock","cuIcon-vip","cuIcon-weibo","cuIcon-activity","cuIcon-friendadd","cuIcon-friendfamous","cuIcon-friend","cuIcon-goods","cuIcon-selection"],recommendList:[],recommendTable:"",recommendTitle:"",recommendPicture:""}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var t,n,i;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return this.role=uni.getStorageSync("role"),t=uni.getStorageSync("nowTable"),e.next=4,this.$api.session(t);case 4:n=e.sent,this.user=n.data,this.tableName=t,i=a.default.list(),this.menuList=i;case 9:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),onShow:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var t,n,i;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return uni.removeStorageSync("useridTag"),this.role=uni.getStorageSync("role"),t=uni.getStorageSync("nowTable"),e.next=5,this.$api.session(t);case 5:n=e.sent,this.user=n.data,this.getThumbsup(),this.getStoreup(),this.tableName=t,i=a.default.list(),this.menuList=i,this.getRecommendList();case 13:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),methods:{getThumbsup:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var t;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,this.$api.page("storeup",{userid:this.user.id,type:21});case 2:t=e.sent,this.user.thumbsnum=Number(t.data.total),this.$forceUpdate();case 5:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),getStoreup:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var t;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,this.$api.page("storeup",{userid:this.user.id,type:1});case 2:t=e.sent,this.user.storenum=Number(t.data.total),this.$forceUpdate();case 5:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),loginClick:function(){uni.navigateTo({url:"../login/login"})},onPageTap:function(e){uni.setStorageSync("useridTag",1),uni.navigateTo({url:e,fail:function(){uni.switchTab({url:e})}})},recommendDetail:function(e){uni.navigateTo({url:"../".concat(this.recommendTable,"/detail?id=").concat(e),fail:function(){uni.switchTab({url:"../".concat(this.recommendTable,"/detail?id=").concat(e)})}})}}};t.default=o},"9a01":function(e,t,n){"use strict";var i,r=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("v-uni-view",{staticClass:"content"},[n("v-uni-view",{style:{minHeight:"100vh",width:"100%",padding:"24rpx",position:"relative",background:"#eefcff",height:"auto"}},[e.user?n("v-uni-view",{staticClass:"header",class:{status:e.isH5Plus},style:{padding:"24rpx 24rpx",boxShadow:"0 2rpx 12rpx #76c4d850",margin:"0 0 80rpx 0",borderRadius:"60rpx",background:"#fff",display:"flex",width:"100%",position:"relative",height:"auto"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onPageTap("../user-info/user-info")}}},["yonghu"==e.tableName?n("v-uni-view",{staticClass:"userinfo",style:{alignContent:"center",padding:"0",margin:"0",alignItems:"center",flexWrap:"wrap",flex:"1",background:"none",display:"flex",width:"100%",height:"100%"}},[n("v-uni-image",{style:{width:"88rpx",padding:"0",margin:"0 20rpx 0 0",borderRadius:"100%",height:"88rpx"},attrs:{src:e.user.touxiang?e.baseUrl+e.user.touxiang:"/static/gen/upload.png"}}),n("v-uni-view",{staticClass:"info",style:{width:"240rpx",flex:"1",flexDirection:"column",justifyContent:"center",display:"flex"}},[n("v-uni-view",{style:{width:"100%",lineHeight:"36rpx",fontSize:"28rpx",color:"#000"}},[e._v(e._s(e.user.yonghuzhanghao)),e.user.vip&&"是"==e.user.vip?n("v-uni-text",[e._v("(VIP)")]):e._e()],1)],1),n("v-uni-view",{staticClass:"info",style:{width:"100%",margin:"20rpx 0 0",flexWrap:"wrap",flexDirection:"row",display:"flex"}},[n("v-uni-view",{style:{width:"auto",margin:"0 20rpx 20rpx 0",lineHeight:"36rpx",fontSize:"28rpx",color:"#888"}},[e._v("手机："+e._s(e.user.dianhua))])],1)],1):e._e(),n("v-uni-view",{staticClass:"setting",style:{padding:"8rpx 20rpx",alignItems:"center",top:"24rpx",borderRadius:"16rpx",background:"none",display:"flex",width:"auto",position:"absolute",right:"24rpx",justifyContent:"center",height:"auto"}},[n("v-uni-text",{staticClass:"icon iconfont icon-qita6",style:{border:"0",margin:"0 6rpx 0 0",color:"#76c4d8",borderRadius:"0",display:"inline-block",width:"48rpx",lineHeight:"48rpx",fontSize:"48rpx"}}),n("v-uni-text",{style:{lineHeight:"2",fontSize:"28rpx",color:"#76c4d8",display:"inline-block"}},[e._v("设置")])],1)],1):n("v-uni-view",{staticClass:"header",class:{status:e.isH5Plus},style:{padding:"24rpx 24rpx",boxShadow:"0 2rpx 12rpx #76c4d850",margin:"0 0 80rpx 0",borderRadius:"60rpx",background:"#fff",display:"flex",width:"100%",position:"relative",height:"auto"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.loginClick.apply(void 0,arguments)}}},[n("v-uni-view",{staticStyle:{width:"100%",height:"100%",display:"flex","align-items":"center","justify-content":"center","font-size":"18px",color:"#666"}},[e._v("登录/注册")])],1),n("v-uni-view",{staticClass:"list",style:{width:"100%",background:"none",height:"auto"}},[n("v-uni-view",{style:{width:"100%",padding:"10rpx 6rpx",margin:"40rpx 0 0",borderRadius:"16rpx",background:"none",height:"auto"}},[n("v-uni-view",{style:{padding:"0 20rpx",background:"url(http://codegen.caihongy.cn/20231213/2ba3fe4cf1134a6aa6bc64f2785ede40.png) no-repeat center bottom / 100% auto",display:"flex",width:"100%",lineHeight:"100rpx",justifyContent:"center",height:"88rpx"}},[n("v-uni-view",{style:{fontSize:"32rpx",lineHeight:"72rpx",color:"#76c4d8",fontWeight:"500"}},[e._v("我的服务")])],1),n("v-uni-view",{style:{padding:"0 2% 0 0",margin:"40rpx 0 0",flexWrap:"wrap",flexDirection:"row",display:"flex",width:"100%",justifyContent:"flex-start",height:"auto"}},[e._l(e.menuList,(function(t){return[e._l(t.backMenu,(function(i,r){return e.role==t.roleName?[e._l(i.child,(function(t,i){return["yifahuodingdan"!=t.tableName&&"yituikuandingdan"!=t.tableName&&"yiquxiaodingdan"!=t.tableName&&"weizhifudingdan"!=t.tableName&&"yizhifudingdan"!=t.tableName&&"yiwanchengdingdan"!=t.tableName&&"exampaper"!=t.tableName&&"examquestion"!=t.tableName?n("v-uni-view",{key:i+"_0",staticClass:"li",style:{padding:"20rpx 4rpx",boxShadow:"2rpx 4rpx 16rpx #76c4d880",borderColor:"#e2e2e2",margin:"0 0 40rpx 3%",alignItems:"center",display:"flex",justifyContent:"center",borderRadius:"60rpx",flexWrap:"wrap",borderWidth:"0px",background:"#fff",width:"30%",borderStyle:"solid",height:"100%"},attrs:{"hover-class":"hover"},on:{click:function(n){arguments[0]=n=e.$handleEvent(n),e.onPageTap("../"+t.tableName+"/list?userid="+e.user.id+"&menuJump="+t.menuJump)}}},[n("v-uni-view",{class:t.appFrontIcon,style:{width:"100%",lineHeight:"1",fontSize:"64rpx",color:"#e2887e",textAlign:"center"}}),n("v-uni-view",{staticClass:"text",style:{padding:"0 20rpx",margin:"10rpx 0 0",color:"#333",textAlign:"center",flex:"1",width:"100%",fontSize:"28rpx"}},[e._v(e._s(t.menu))]),n("v-uni-view",{staticClass:"icon iconfont icon-jinru",style:{width:"28rpx",lineHeight:"28rpx",fontSize:"28rpx",color:"#999",display:"none"}})],1):e._e()]}))]:e._e()}))]})),n("v-uni-view",{staticClass:"li",style:{padding:"20rpx 4rpx",boxShadow:"2rpx 4rpx 16rpx #76c4d880",borderColor:"#e2e2e2",margin:"0 0 40rpx 3%",alignItems:"center",display:"flex",justifyContent:"center",borderRadius:"60rpx",flexWrap:"wrap",borderWidth:"0px",background:"#fff",width:"30%",borderStyle:"solid",height:"100%"},attrs:{"hover-class":"hover"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onPageTap("../chat/chat")}}},[n("v-uni-view",{staticClass:"cuIcon-service",style:{width:"100%",lineHeight:"1",fontSize:"64rpx",color:"#e2887e",textAlign:"center"}}),n("v-uni-view",{staticClass:"text",style:{padding:"0 20rpx",margin:"10rpx 0 0",color:"#333",textAlign:"center",flex:"1",width:"100%",fontSize:"28rpx"}},[e._v("健康咨询")]),n("v-uni-view",{staticClass:"icon iconfont icon-jinru",style:{width:"28rpx",lineHeight:"28rpx",fontSize:"28rpx",color:"#999",display:"none"}})],1),n("v-uni-view",{staticClass:"li",style:{padding:"20rpx 4rpx",boxShadow:"2rpx 4rpx 16rpx #76c4d880",borderColor:"#e2e2e2",margin:"0 0 40rpx 3%",alignItems:"center",display:"flex",justifyContent:"center",borderRadius:"60rpx",flexWrap:"wrap",borderWidth:"0px",background:"#fff",width:"30%",borderStyle:"solid",height:"100%"},attrs:{"hover-class":"hover"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onPageTap("../forum-add-or-update/forum-add-or-update")}}},[n("v-uni-view",{staticClass:"cuIcon-scan",style:{width:"100%",lineHeight:"1",fontSize:"64rpx",color:"#e2887e",textAlign:"center"}}),n("v-uni-view",{staticClass:"text",style:{padding:"0 20rpx",margin:"10rpx 0 0",color:"#333",textAlign:"center",flex:"1",width:"100%",fontSize:"28rpx"}},[e._v("我要发贴")]),n("v-uni-view",{staticClass:"icon iconfont icon-jinru",style:{width:"28rpx",lineHeight:"28rpx",fontSize:"28rpx",color:"#999",display:"none"}})],1),n("v-uni-view",{staticClass:"li",style:{padding:"20rpx 4rpx",boxShadow:"2rpx 4rpx 16rpx #76c4d880",borderColor:"#e2e2e2",margin:"0 0 40rpx 3%",alignItems:"center",display:"flex",justifyContent:"center",borderRadius:"60rpx",flexWrap:"wrap",borderWidth:"0px",background:"#fff",width:"30%",borderStyle:"solid",height:"100%"},attrs:{"hover-class":"hover"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onPageTap("../forum-my/forum-my")}}},[n("v-uni-view",{staticClass:"cuIcon-scan",style:{width:"100%",lineHeight:"1",fontSize:"64rpx",color:"#e2887e",textAlign:"center"}}),n("v-uni-view",{staticClass:"text",style:{padding:"0 20rpx",margin:"10rpx 0 0",color:"#333",textAlign:"center",flex:"1",width:"100%",fontSize:"28rpx"}},[e._v("我的发贴")]),n("v-uni-view",{staticClass:"icon iconfont icon-jinru",style:{width:"28rpx",lineHeight:"28rpx",fontSize:"28rpx",color:"#999",display:"none"}})],1)],2)],1)],1),e.recommendList.length?n("v-uni-view",{staticClass:"recommend",style:{width:"100%",padding:"20rpx 0",margin:"40rpx 0 0",borderRadius:"0px",background:"none",height:"auto"}},[n("v-uni-view",{style:{padding:"0 24rpx",color:"#76c4d8",textAlign:"center",background:"url(http://codegen.caihongy.cn/20231213/d1495c4de2a34153b601bf933a392cbe.png) no-repeat center top",width:"100%",lineHeight:"116rpx",fontSize:"32rpx",fontWeight:"500"}},[e._v("为你推荐")]),n("v-uni-view",{style:{padding:"0px",margin:"40rpx 0 0",flexWrap:"wrap",background:"none",display:"flex",width:"100%",justifyContent:"space-between",height:"auto"}},e._l(e.recommendList,(function(t,i){return n("v-uni-view",{key:i,style:{padding:"20rpx",boxShadow:"0 2rpx 12rpx #76c4d880",margin:"0 0 40rpx",borderRadius:"60rpx",background:"#fff",width:"100%",height:"auto"},on:{click:function(n){arguments[0]=n=e.$handleEvent(n),e.recommendDetail(t.id)}}},[n("v-uni-image",{style:{width:"240rpx",objectFit:"cover",borderRadius:"60rpx",float:"left",display:"block",height:"180rpx"},attrs:{src:t[e.recommendPicture]?e.baseUrl+t[e.recommendPicture].split(",")[0]:""}}),n("v-uni-view",{style:{padding:"0 8rpx",overflow:"hidden",whiteSpace:"nowrap",color:"#000",width:"calc(100% - 280rpx)",lineHeight:"80rpx",fontSize:"28rpx",textOverflow:"ellipsis",float:"right"}},[e._v(e._s(t[e.recommendTitle]))]),n("v-uni-view",{style:{padding:"0 8rpx",color:"#999",textAlign:"right",width:"calc(100% - 280rpx)",lineHeight:"48rpx",fontSize:"28rpx",float:"right"}},[e._v(e._s(t.addtime))])],1)})),1)],1):e._e(),n("v-uni-view",{staticStyle:{width:"100%",height:"80px"}})],1)],1)},a=[];n.d(t,"b",(function(){return r})),n.d(t,"c",(function(){return a})),n.d(t,"a",(function(){return i}))},d2c0:function(e,t,n){"use strict";n.r(t);var i=n("9a01"),r=n("27ae");for(var a in r)"default"!==a&&function(e){n.d(t,e,(function(){return r[e]}))}(a);n("247f");var o,c=n("f0c5"),s=Object(c["a"])(r["default"],i["b"],i["c"],!1,null,"4460745e",null,!1,i["a"],o);t["default"]=s.exports},e90b:function(e,t,n){var i=n("24fb");t=i(!1),t.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-4460745e]{height:calc(100vh - 94px);box-sizing:border-box}',""]),e.exports=t}}]);