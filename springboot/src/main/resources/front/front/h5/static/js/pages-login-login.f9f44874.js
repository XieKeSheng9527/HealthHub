(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-login-login"],{3285:function(t,e,i){"use strict";i.r(e);var n=i("6263"),r=i.n(n);for(var a in n)"default"!==a&&function(t){i.d(e,t,(function(){return n[t]}))}(a);e["default"]=r.a},6263:function(t,e,i){"use strict";var n=i("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,i("96cf");var r=n(i("3b8d")),a=n(i("2971")),o={data:function(){return{username:"",password:"",loginType:1,codes:[{num:1,color:"#000",rotate:"10deg",size:"16px"},{num:2,color:"#000",rotate:"10deg",size:"16px"},{num:3,color:"#000",rotate:"10deg",size:"16px"},{num:4,color:"#000",rotate:"10deg",size:"16px"}],options:["请选择登录用户类型"],optionsValues:["","yonghu"],index:0,roleNum:0}},onLoad:function(){var t=["请选择登录用户类型"],e=a.default.list();this.menuList=e;for(var i=0;i<this.menuList.length;i++)"是"==this.menuList[i].hasFrontLogin&&(t.push(this.menuList[i].roleName),this.roleNum++);1==this.roleNum&&(this.index=1),this.options=t,this.styleChange()},onShow:function(){},mounted:function(){},methods:{styleChange:function(){this.$nextTick((function(){}))},onRegisterTap:function(t){uni.setStorageSync("loginTable",t),this.$utils.jump("../register/register")},onLoginTap:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(this.username){t.next=3;break}return this.$utils.msg("请输入用户名"),t.abrupt("return");case 3:if(this.password){t.next=6;break}return this.$utils.msg("请输入用户密码"),t.abrupt("return");case 6:if(this.optionsValues[this.index]){t.next=9;break}return this.$utils.msg("请选择登录用户类型"),t.abrupt("return");case 9:this.loginPost();case 10:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}(),loginPost:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(){var e;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,this.$api.login("".concat(this.optionsValues[this.index]),{username:this.username,password:this.password});case 2:return e=t.sent,uni.removeStorageSync("useridTag"),uni.setStorageSync("token",e.token),uni.setStorageSync("nickname",this.username),uni.setStorageSync("nowTable","".concat(this.optionsValues[this.index])),t.next=9,this.$api.session("".concat(this.optionsValues[this.index]));case 9:e=t.sent,e.data.touxiang?uni.setStorageSync("headportrait",e.data.touxiang):e.data.headportrait&&uni.setStorageSync("headportrait",e.data.headportrait),uni.setStorageSync("userid",e.data.id),e.data.vip&&uni.setStorageSync("vip",e.data.vip),uni.setStorageSync("role","".concat(this.options[this.index])),this.$utils.tab("../index/index");case 15:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}(),optionsChange:function(t){this.index=t.target.value}}};e.default=o},7319:function(t,e,i){"use strict";var n,r=function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("v-uni-view",{staticClass:"content"},[i("v-uni-view",{staticClass:"box",style:{minHeight:"100vh",width:"100%",padding:"400rpx 24rpx 24rpx",background:"url(http://codegen.caihongy.cn/20231214/00b1632868ad4df5b6ac9b36b9a9a6c7.png) no-repeat center top / 100% auto,#fff",height:"auto"}},[i("v-uni-view",{style:{padding:"44rpx 44rpx 64rpx 24rpx",margin:"0 0 80rpx",borderRadius:"40rpx",alignItems:"flex-start",flexWrap:"wrap",background:"rgba(255,255,255,.6)",display:"flex",width:"100%",position:"relative",height:"auto"}},[i("v-uni-image",{style:{width:"160rpx",margin:"0 auto 24rpx auto",borderRadius:"8rpx",display:"none",height:"160rpx"},attrs:{src:"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg",mode:"aspectFill"}}),1==t.loginType?i("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",margin:"0 0 24rpx 0",borderColor:"#349fbb",textAlign:"left",borderWidth:"0 0 2rpx",display:"flex",width:"100%",borderStyle:"solid",height:"76rpx"}},[i("v-uni-view",{staticClass:"label",style:{width:"160rpx",lineHeight:"76rpx",fontSize:"28rpx",color:"#666",textAlign:"right",fontWeight:"500"}},[t._v("账号：")]),i("v-uni-input",{staticClass:"uni-input",style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"0px",flex:"1",background:"rgba(255,255,255,.6)",fontSize:"28rpx",height:"76rpx"},attrs:{type:"text",name:"",placeholder:"请输入账号"},model:{value:t.username,callback:function(e){t.username=e},expression:"username"}})],1):t._e(),1==t.loginType?i("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",margin:"0 0 24rpx 0",borderColor:"#349fbb",textAlign:"left",borderWidth:"0 0 2rpx",display:"flex",width:"100%",borderStyle:"solid",height:"76rpx"}},[i("v-uni-view",{staticClass:"label",style:{width:"160rpx",lineHeight:"76rpx",fontSize:"28rpx",color:"#666",textAlign:"right",fontWeight:"500"}},[t._v("密码：")]),i("v-uni-input",{staticClass:"uni-input",style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"0px",flex:"1",background:"rgba(255,255,255,.6)",fontSize:"28rpx",height:"76rpx"},attrs:{type:"password",name:"",placeholder:"请输入密码"},model:{value:t.password,callback:function(e){t.password=e},expression:"password"}})],1):t._e(),t.roleNum>1?i("v-uni-view",{style:{margin:"0 0 24rpx 0",borderColor:"#349fbb",textAlign:"left",borderWidth:"0 0 2rpx",display:"flex",width:"100%",borderStyle:"solid",height:"76rpx"}},[i("v-uni-view",{staticClass:"label",style:{width:"160rpx",lineHeight:"76rpx",fontSize:"28rpx",color:"#666",textAlign:"right",fontWeight:"500"}},[t._v("用户类型：")]),i("v-uni-picker",{style:{padding:"0 20rpx",color:"#888",borderRadius:"8rpx",background:"rgba(255,255,255,.6)",display:"inline-block",width:"calc(100% - 160rpx)",lineHeight:"76rpx",fontSize:"28rpx"},attrs:{value:t.index,range:t.options},on:{change:function(e){arguments[0]=e=t.$handleEvent(e),t.optionsChange.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"uni-picker-type"},[t._v(t._s(t.options[t.index]))])],1)],1):t._e(),1==t.loginType?i("v-uni-button",{staticClass:"btn-submit",style:{border:"0",padding:"0px",margin:"48rpx auto 24rpx",color:"rgb(255, 255, 255)",borderRadius:"60rpx",background:"#76c4d8",width:"60%",lineHeight:"88rpx",fontSize:"32rpx",fontWeight:"600",height:"88rpx"},attrs:{type:"primary"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onLoginTap.apply(void 0,arguments)}}},[t._v("登录")]):t._e(),2==t.loginType?i("v-uni-button",{staticClass:"btn-submit",style:{border:"0",padding:"0px",margin:"48rpx auto 24rpx",color:"rgb(255, 255, 255)",borderRadius:"60rpx",background:"#76c4d8",width:"60%",lineHeight:"88rpx",fontSize:"32rpx",fontWeight:"600",height:"88rpx"},attrs:{type:"primary"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onFaceLoginTap.apply(void 0,arguments)}}},[t._v("人脸识别登录")]):t._e(),i("v-uni-view",{staticClass:"links",style:{width:"100%",padding:"0",margin:"0 0 24rpx 0",flexWrap:"wrap",display:"flex",height:"auto"}},[i("v-uni-view",{staticClass:"link-highlight",style:{padding:"0 0px",margin:"0 20rpx 20rpx 0",fontSize:"28rpx",color:"#349fbb"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onRegisterTap("yonghu")}}},[t._v("注册用户")])],1),i("v-uni-view",{staticClass:"idea1",style:{width:"100%",background:"red",display:"none",height:"80rpx"}},[t._v("idea1")]),i("v-uni-view",{staticClass:"idea2",style:{width:"100%",background:"red",display:"none",height:"80rpx"}},[t._v("idea2")]),i("v-uni-view",{staticClass:"idea3",style:{width:"100%",background:"red",display:"none",height:"80rpx"}},[t._v("idea3")])],1)],1)],1)},a=[];i.d(e,"b",(function(){return r})),i.d(e,"c",(function(){return a})),i.d(e,"a",(function(){return n}))},"8a66":function(t,e,i){"use strict";var n=i("c560"),r=i.n(n);r.a},a86a:function(t,e,i){"use strict";i.r(e);var n=i("7319"),r=i("3285");for(var a in r)"default"!==a&&function(t){i.d(e,t,(function(){return r[t]}))}(a);i("8a66");var o,s=i("f0c5"),u=Object(s["a"])(r["default"],n["b"],n["c"],!1,null,"10c3c864",null,!1,n["a"],o);e["default"]=u.exports},c560:function(t,e,i){var n=i("c78d");"string"===typeof n&&(n=[[t.i,n,""]]),n.locals&&(t.exports=n.locals);var r=i("4f06").default;r("2500ce9c",n,!0,{sourceMap:!1,shadowMode:!1})},c78d:function(t,e,i){var n=i("24fb");e=n(!1),e.push([t.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */uni-page-body[data-v-10c3c864]{height:100%}.content[data-v-10c3c864]{height:100%;box-sizing:border-box}',""]),t.exports=e}}]);