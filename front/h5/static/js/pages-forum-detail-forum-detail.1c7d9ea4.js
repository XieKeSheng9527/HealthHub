(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-forum-detail-forum-detail"],{"01f7":function(e,t,i){"use strict";var n=i("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,i("a481"),i("96cf");var a=n(i("3b8d")),r=n(i("f8c1")),s={components:{userReply:r.default},data:function(){return{commentData:[],forum:{},id:"",likeType:!1,likeForm:{}}},computed:{baseUrl:function(){return this.$base.url},userid:function(){return uni.getStorageSync("userid")}},onLoad:function(){var e=(0,a.default)(regeneratorRuntime.mark((function e(t){var i;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return this.id=t.id,e.next=3,this.$api.forumDetail(t.id);case 3:i=e.sent,i.data.childs=this.changeContent(i.data.childs),this.commentData=i.data.childs,i.data.content=i.data.content.replace(/img src/gi,'img style="width:100%;" src'),this.forum=i.data,this.getLike();case 9:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}(),onShow:function(){var e=(0,a.default)(regeneratorRuntime.mark((function e(){var t;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,this.$api.forumDetail(this.id);case 2:t=e.sent,t.data.childs=this.changeContent(t.data.childs),this.commentData=t.data.childs,this.forum=t.data,t.data.content=t.data.content.replace(/img src/gi,'img style="width:100%;" src');case 7:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),methods:{getLike:function(){var e=(0,a.default)(regeneratorRuntime.mark((function e(){var t;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,this.$api.list("storeup",{page:1,limit:1,type:21,userid:uni.getStorageSync("userid"),refid:this.id,tablename:"forum"});case 2:t=e.sent,t.data.list.length?(this.likeType=!0,this.likeForm=t.data.list[0]):this.likeType=!1;case 4:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),likeClick:function(){var e=(0,a.default)(regeneratorRuntime.mark((function e(){var t;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=this,!this.likeType){e.next=5;break}uni.showModal({title:"提示",content:"是否取消点赞？",success:function(){var e=(0,a.default)(regeneratorRuntime.mark((function e(i){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!i.confirm){e.next=5;break}return e.next=3,t.$api.del("storeup",JSON.stringify([t.likeForm.id]));case 3:t.$utils.msg("取消成功"),t.getLike();case 5:case"end":return e.stop()}}),e)})));function i(t){return e.apply(this,arguments)}return i}()}),e.next=9;break;case 5:return e.next=7,t.$api.add("storeup",{userid:uni.getStorageSync("userid"),refid:this.id,type:21,name:this.forum.title,picture:"",tablename:"forum"});case 7:this.$utils.msg("点赞成功"),this.getLike();case 9:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),changeContent:function(e){return e&&(e=t(e)),e;function t(e){for(var i in e)e[i].content=e[i].content.replace(/img src/gi,'img style="width:100%;" src'),e[i].childs&&(e[i].childs=t(e[i].childs));return e}},onReplyTap:function(e){this.$utils.jump("../forum-reply/forum-reply?pid=".concat(e))},delClick:function(e){var t=this;uni.showModal({title:"提示",content:"是否删除此评论？",success:function(){var i=(0,a.default)(regeneratorRuntime.mark((function i(n){return regeneratorRuntime.wrap((function(i){while(1)switch(i.prev=i.next){case 0:if(!n.confirm){i.next=5;break}return i.next=3,t.$api.del("forum",JSON.stringify([e]));case 3:t.$utils.msg("删除成功"),setTimeout((0,a.default)(regeneratorRuntime.mark((function e(){var i;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,t.$api.forumDetail(t.id);case 2:i=e.sent,i.data.childs=t.changeContent(i.data.childs),t.commentData=i.data.childs;case 5:case"end":return e.stop()}}),e)}))),1500);case 5:case"end":return i.stop()}}),i)})));function n(e){return i.apply(this,arguments)}return n}()})}}};t.default=s},"03bc":function(e,t,i){"use strict";i.r(t);var n=i("e8e2"),a=i.n(n);for(var r in n)"default"!==r&&function(e){i.d(t,e,(function(){return n[e]}))}(r);t["default"]=a.a},"25aa":function(e,t,i){var n=i("24fb");t=n(!1),t.push([e.i,".article-meta[data-v-390f2180]{display:-webkit-box;display:-webkit-flex;display:flex;\n\t\t/* align-items: center; */-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;background:#fdfdfd;border:1px #ddd solid;border-radius:%?10?%;margin-bottom:%?20?%;padding:%?5?%}.article-meta-box[data-v-390f2180]{padding-top:%?20?%;padding-left:%?10?%;padding-bottom:0;display:-webkit-box;display:-webkit-flex;display:flex;\n\t\t/* align-items: center; */-webkit-box-pack:start;-webkit-justify-content:flex-start;justify-content:flex-start;color:grey}.article-header-image[data-v-390f2180]{width:%?60?%;height:%?60?%;-webkit-flex-shrink:0;flex-shrink:0;\n        /* border-radius: 50%; */overflow:hidden}.article-header-image .image[data-v-390f2180]{width:100%;height:100%}.article-header-content[data-v-390f2180]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between;font-size:%?24?%;line-height:1;\n\t\t/* width: 100%; */padding-left:10px;padding-right:%?20?%\n\t\t/* height: 60rpx; */}.article-header-title[data-v-390f2180]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between;-webkit-box-align:center;-webkit-align-items:center;align-items:center;font-size:%?26?%;line-height:1;color:#000}.article-header-title-text[data-v-390f2180]{line-height:1.2}.article-top[data-v-390f2180]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:end;-webkit-align-items:flex-end;align-items:flex-end;font-size:%?26?%;color:#999;line-height:1}.article-top .image[data-v-390f2180]{width:%?30?%;margin-left:%?5?%}.article-header-info[data-v-390f2180]{margin-top:%?10?%;font-size:%?24?%;line-height:1}.uni-article__comment-centent[data-v-390f2180]{padding:%?20?%;padding-left:0;color:#333;font-size:%?28?%;width:100%}.btn-replay[data-v-390f2180]{color:red;float:right}",""]),e.exports=t},"44c6":function(e,t,i){"use strict";var n,a=function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("v-uni-view",[i("v-uni-view",{staticClass:"article-meta"},[e.newData.childs?i("user-reply",{attrs:{digest:e.newData.childs}}):e._e(),i("v-uni-view",{staticClass:"article-meta-box"},[i("v-uni-view",{staticClass:"article-header-image"},[i("v-uni-image",{staticClass:"image",attrs:{src:e.baseUrl+e.newData.avatarurl,mode:"widthFix"}})],1),i("v-uni-view",{staticStyle:{width:"100%"}},[i("v-uni-view",{staticClass:"article-header-content"},[i("v-uni-view",{staticClass:"article-header-title"},[e._v(e._s(e.newData.username))]),i("v-uni-view",{staticClass:"article-header-info"},[e._v(e._s(e.newData.addtime||""))])],1),i("v-uni-view",{staticClass:"uni-article__comment-centent"},[i("v-uni-rich-text",{attrs:{nodes:e.newData.content}}),i("v-uni-text",{staticClass:"btn-replay",on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onReplyTap(e.newData.id)}}},[e._v("回复")])],1)],1)],1)],1)],1)},r=[];i.d(t,"b",(function(){return a})),i.d(t,"c",(function(){return r})),i.d(t,"a",(function(){return n}))},"51e8":function(e,t,i){"use strict";var n,a=function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("v-uni-view",[i("v-uni-view",{staticClass:"title"},[e._v(e._s(e.forum.title))]),i("v-uni-view",{staticClass:"username"},[e._v("发布人："+e._s(e.forum.username))]),i("v-uni-view",{staticClass:"operateView"},[i("v-uni-view",{staticClass:"like_box",class:e.likeType?"likeActive":"",on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.likeClick.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"cuIcon-appreciate icon"}),e._v(e._s(e.likeType?"已":"")+"赞")],1)],1),i("v-uni-view",{staticClass:"content"},[i("v-uni-rich-text",{attrs:{nodes:e.forum.content}})],1),i("v-uni-view",{staticClass:"uni-article__comment"},[e._l(e.commentData,(function(t){return i("v-uni-view",{key:t.id,staticClass:"uni-article__comment-box"},[i("v-uni-view",{staticClass:"article-meta"},[i("v-uni-view",{staticClass:"article-header-image"},[i("v-uni-image",{staticClass:"image",attrs:{src:e.baseUrl+t.avatarurl,mode:"widthFix"}})],1),i("v-uni-view",{staticClass:"article-header-content"},[i("v-uni-view",{staticClass:"article-header-title"},[i("v-uni-text",[e._v(e._s(t.username))])],1),i("v-uni-view",{staticClass:"article-header-info"},[e._v(e._s(t.addtime||""))])],1)],1),i("v-uni-view",{staticClass:"uni-article__comment-centent"},[i("v-uni-rich-text",{staticStyle:{width:"100%"},attrs:{nodes:t.content}}),i("v-uni-view",{staticClass:"btn-replay"},[i("v-uni-text",{staticStyle:{padding:"0 6px"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.onReplyTap(t.id)}}},[e._v("回复")]),e.userid==t.userid?i("v-uni-text",{on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.delClick(t.id)}}},[e._v("删除")]):e._e()],1)],1),t.childs?i("v-uni-view",{staticStyle:{width:"100%",padding:"0 0 0 60px","box-sizing":"border-box"}},e._l(t.childs,(function(t){return i("v-uni-view",{key:t.id,staticClass:"uni-article__comment-box"},[i("v-uni-view",{staticClass:"article-meta"},[i("v-uni-view",{staticClass:"article-header-image"},[i("v-uni-image",{staticClass:"image",attrs:{src:e.baseUrl+t.avatarurl,mode:"widthFix"}})],1),i("v-uni-view",{staticClass:"article-header-content"},[i("v-uni-view",{staticClass:"article-header-title"},[i("v-uni-text",[e._v(e._s(t.username))])],1),i("v-uni-view",{staticClass:"article-header-info"},[e._v(e._s(t.addtime||""))])],1)],1),i("v-uni-view",{staticClass:"uni-article__comment-centent"},[i("v-uni-rich-text",{staticStyle:{width:"100%"},attrs:{nodes:t.content}}),e.userid==t.userid?i("v-uni-text",{staticClass:"btn-replay",on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.delClick(t.id)}}},[e._v("删除")]):e._e()],1)],1)})),1):e._e()],1)})),i("v-uni-view",{staticClass:"kong"}),i("v-uni-view",{staticClass:"bottom-content"},[i("v-uni-button",{staticClass:"bg-red margin-tb-sm",on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onReplyTap(e.forum.id)}}},[e._v("评论")])],1)],2)],1)},r=[];i.d(t,"b",(function(){return a})),i.d(t,"c",(function(){return r})),i.d(t,"a",(function(){return n}))},"5ca4":function(e,t,i){"use strict";var n=i("84f7"),a=i.n(n);a.a},"69a6":function(e,t,i){"use strict";i.r(t);var n=i("01f7"),a=i.n(n);for(var r in n)"default"!==r&&function(e){i.d(t,e,(function(){return n[e]}))}(r);t["default"]=a.a},"84f7":function(e,t,i){var n=i("25aa");"string"===typeof n&&(n=[[e.i,n,""]]),n.locals&&(e.exports=n.locals);var a=i("4f06").default;a("26e680e8",n,!0,{sourceMap:!1,shadowMode:!1})},8684:function(e,t,i){"use strict";var n=i("8ca1"),a=i.n(n);a.a},"8ca1":function(e,t,i){var n=i("b189");"string"===typeof n&&(n=[[e.i,n,""]]),n.locals&&(e.exports=n.locals);var a=i("4f06").default;a("4f4f48e4",n,!0,{sourceMap:!1,shadowMode:!1})},"95a4":function(e,t,i){"use strict";i.r(t);var n=i("51e8"),a=i("69a6");for(var r in a)"default"!==r&&function(e){i.d(t,e,(function(){return a[e]}))}(r);i("8684");var s,c=i("f0c5"),o=Object(c["a"])(a["default"],n["b"],n["c"],!1,null,"6063581e",null,!1,n["a"],s);t["default"]=o.exports},b189:function(e,t,i){var n=i("24fb");t=n(!1),t.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */uni-page-body[data-v-6063581e]{background:#fff}.title[data-v-6063581e]{text-align:center;font-size:%?40?%;font-weight:700;margin:%?20?%}.username[data-v-6063581e]{text-align:center;font-size:%?20?%;font-weight:700;color:#888;margin:%?20?%}.content[data-v-6063581e]{margin:%?40?%;font-size:%?30?%;line-height:%?50?%;letter-spacing:%?5?%}.article-meta[data-v-6063581e]{padding:%?20?% %?20?%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-orient:horizontal;-webkit-box-direction:normal;-webkit-flex-direction:row;flex-direction:row;-webkit-box-pack:start;-webkit-justify-content:flex-start;justify-content:flex-start;color:grey}.article-header-image[data-v-6063581e]{width:%?60?%;height:%?60?%;-webkit-flex-shrink:0;flex-shrink:0;\n  /* border-radius: 50%; */overflow:hidden}.article-header-image .image[data-v-6063581e]{width:100%;height:100%}.article-header-content[data-v-6063581e]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;padding-left:10px;font-size:%?24?%;line-height:1;width:100%\n  /* height: 60rpx; */}.article-header-title[data-v-6063581e]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between;-webkit-box-align:center;-webkit-align-items:center;align-items:center;font-size:%?26?%;line-height:2;color:#000}.article-header-info[data-v-6063581e]{font-size:%?24?%;line-height:1}.article-top[data-v-6063581e]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:end;-webkit-align-items:flex-end;align-items:flex-end;font-size:%?26?%;line-height:1;color:#999}.article-top .image[data-v-6063581e]{width:%?30?%;margin-left:%?5?%}.uni-article__comment[data-v-6063581e]{margin-bottom:%?160?%}.uni-article__comment-title[data-v-6063581e]{width:100%;line-height:3;font-size:%?28?%;color:#666;background:#f5f5f5;padding-left:%?20?%}.uni-article__comment-centent[data-v-6063581e]{border-bottom:1px #eee solid;padding:0 %?20?%;padding-left:%?95?%;padding-bottom:%?20?%;font-size:14px;color:#333}.btn-replay[data-v-6063581e]{color:red;width:100%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:end;-webkit-justify-content:flex-end;justify-content:flex-end}.bottom-content[data-v-6063581e]{position:fixed;bottom:0;padding:%?20?%;width:100%}.kong[data-v-6063581e]{width:100%;height:%?180?%}.operateView[data-v-6063581e]{width:100%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center}.operateView .like_box[data-v-6063581e]{width:40%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;font-size:%?32?%}.operateView .like_box .icon[data-v-6063581e]{font-size:%?36?%;padding:0 %?6?%}.operateView .likeActive[data-v-6063581e]{color:red}body.?%PAGE?%[data-v-6063581e]{background:#fff}',""]),e.exports=t},e8e2:function(e,t,i){"use strict";var n=i("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,i("28a5"),i("ac6a");var a=n(i("f8c1")),r={name:"userReply",components:{userReply:a.default},props:{digest:{type:Array,default:function(){return{}}}},data:function(){return{newData:{},digestData:[],UNITS:{"年":315576e5,"月":26298e5,"天":864e5,"小时":36e5,"分钟":6e4,"秒":1e3}}},computed:{baseUrl:function(){return this.$base.url}},created:function(){var e=this;this.digest.forEach((function(t,i){console.log(t,i),0===i?e.newData=t:e.digestData.push(t)}))},methods:{format:function(e){var t=this.parse(e),i=Date.now()-t.getTime();if(i<this.UNITS["天"])return this.humanize(i);var n=function(e){return e<10?"0"+e:e};return t.getFullYear()+"-"+n(t.getMonth()+1)+"-"+n(t.getDate())+" "+n(t.getHours())+":"+n(t.getMinutes())},humanize:function(e){var t="";for(var i in this.UNITS)if(e>=this.UNITS[i]){t=Math.floor(e/this.UNITS[i])+i+"前";break}return t||"刚刚"},parse:function(e){var t=e.split(/[^0-9]/);return new Date(t[0],t[1]-1,t[2],t[3],t[4],t[5])},onReplyTap:function(e){this.$utils.jump("../forum-reply/forum-reply?pid=".concat(e))}}};t.default=r},f8c1:function(e,t,i){"use strict";i.r(t);var n=i("44c6"),a=i("03bc");for(var r in a)"default"!==r&&function(e){i.d(t,e,(function(){return a[e]}))}(r);i("5ca4");var s,c=i("f0c5"),o=Object(c["a"])(a["default"],n["b"],n["c"],!1,null,"390f2180",null,!1,n["a"],s);t["default"]=o.exports}}]);