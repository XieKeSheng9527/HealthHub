
var isReady=false;var onReadyCallbacks=[];
var isServiceReady=false;var onServiceReadyCallbacks=[];
var __uniConfig = {"pages":["pages/index/index","pages/login/login","pages/register/register","pages/forget/forget","pages/center/center","pages/user-info/user-info","pages/chat/chat","pages/yonghu/list","pages/yonghu/add-or-update","pages/yonghu/detail","pages/jiankangzhishiku/list","pages/jiankangzhishiku/add-or-update","pages/jiankangzhishiku/detail","pages/zhishileixing/list","pages/zhishileixing/add-or-update","pages/zhishileixing/detail","pages/shiwuyingyang/list","pages/shiwuyingyang/add-or-update","pages/shiwuyingyang/detail","pages/meiriyinshi/list","pages/meiriyinshi/add-or-update","pages/meiriyinshi/detail","pages/yinshijihua/list","pages/yinshijihua/add-or-update","pages/yinshijihua/detail","pages/yundongrizhi/list","pages/yundongrizhi/add-or-update","pages/yundongrizhi/detail","pages/yundongjihua/list","pages/yundongjihua/add-or-update","pages/yundongjihua/detail","pages/jiankangxinxi/list","pages/jiankangxinxi/add-or-update","pages/jiankangxinxi/detail","pages/jiankangpinggu/list","pages/jiankangpinggu/add-or-update","pages/jiankangpinggu/detail","pages/jiankangtixing/list","pages/jiankangtixing/add-or-update","pages/jiankangtixing/detail","pages/shishibushuhehuodongzhuizong/list","pages/shishibushuhehuodongzhuizong/add-or-update","pages/shishibushuhehuodongzhuizong/detail","pages/mubiaogenzongyubaogao/list","pages/mubiaogenzongyubaogao/add-or-update","pages/mubiaogenzongyubaogao/detail","pages/storeup/list","pages/storeup/add-or-update","pages/storeup/detail","pages/discussjiankangzhishiku/list","pages/discussjiankangzhishiku/add-or-update","pages/discussjiankangzhishiku/detail","pages/forum-index/forum-index","pages/forum-detail/forum-detail","pages/forum-reply/forum-reply","pages/forum-list/list","pages/forum-my/forum-my","pages/forum-add-or-update/forum-add-or-update","common/linkOthers/linkOthers"],"window":{"navigationBarTextStyle":"black","navigationBarTitleText":"Biohealth management system","navigationBarBackgroundColor":"#F8F8F8","backgroundColor":"#F8F8F8"},"tabBar":{"color":"#76C4D8","selectedColor":"#20849F","borderStyle":"white","backgroundColor":"#EEFCFF","list":[{"pagePath":"pages/index/index","iconPath":"static/tabs/index.png","selectedIconPath":"static/tabs/index1.png","text":"home page"},{"pagePath":"pages/shiwuyingyang/list","iconPath":"/static/tabs/icon1.png","selectedIconPath":"/static/tabs/icon1_act.png","text":"food nutrition"},{"pagePath":"pages/forum-index/forum-index","iconPath":"static/tabs/forum.png","selectedIconPath":"static/tabs/forum_act.png","text":"Community interaction"},{"pagePath":"pages/center/center","iconPath":"static/tabs/mine.png","selectedIconPath":"static/tabs/mine1.png","text":"mine"}]},"darkmode":false,"nvueCompiler":"uni-app","nvueStyleCompiler":"weex","renderer":"auto","splashscreen":{"alwaysShowBeforeRender":true,"autoclose":false},"appname":"app02","compilerVersion":"3.96","entryPagePath":"pages/index/index","networkTimeout":{"request":60000,"connectSocket":60000,"uploadFile":60000,"downloadFile":60000}};
var __uniRoutes = [{"path":"/pages/index/index","meta":{"isQuit":true,"isTabBar":true},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black","navigationBarTitleText":"Home"}},{"path":"/pages/login/login","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black","navigationBarTitleText":"登录"}},{"path":"/pages/register/register","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black","navigationBarTitleText":"注册"}},{"path":"/pages/forget/forget","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black","navigationBarTitleText":"忘记密码"}},{"path":"/pages/center/center","meta":{"isQuit":true,"isTabBar":true},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black","navigationBarTitleText":"Mine"}},{"path":"/pages/user-info/user-info","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black","navigationBarTitleText":"user information"}},{"path":"/pages/chat/chat","meta":{},"window":{"navigationBarTitleText":"health counseling"}},{"path":"/pages/yonghu/list","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/yonghu/add-or-update","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/yonghu/detail","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/jiankangzhishiku/list","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/jiankangzhishiku/add-or-update","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/jiankangzhishiku/detail","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/zhishileixing/list","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/zhishileixing/add-or-update","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/zhishileixing/detail","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/shiwuyingyang/list","meta":{"isQuit":true,"isTabBar":true},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/shiwuyingyang/add-or-update","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/shiwuyingyang/detail","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/meiriyinshi/list","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/meiriyinshi/add-or-update","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/meiriyinshi/detail","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/yinshijihua/list","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/yinshijihua/add-or-update","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/yinshijihua/detail","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/yundongrizhi/list","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/yundongrizhi/add-or-update","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/yundongrizhi/detail","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/yundongjihua/list","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/yundongjihua/add-or-update","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/yundongjihua/detail","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/jiankangxinxi/list","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/jiankangxinxi/add-or-update","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/jiankangxinxi/detail","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/jiankangpinggu/list","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/jiankangpinggu/add-or-update","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/jiankangpinggu/detail","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/jiankangtixing/list","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/jiankangtixing/add-or-update","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/jiankangtixing/detail","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/shishibushuhehuodongzhuizong/list","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/shishibushuhehuodongzhuizong/add-or-update","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/shishibushuhehuodongzhuizong/detail","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/mubiaogenzongyubaogao/list","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/mubiaogenzongyubaogao/add-or-update","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/mubiaogenzongyubaogao/detail","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/storeup/list","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/storeup/add-or-update","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/storeup/detail","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/discussjiankangzhishiku/list","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/discussjiankangzhishiku/add-or-update","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/discussjiankangzhishiku/detail","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}},{"path":"/pages/forum-index/forum-index","meta":{"isQuit":true,"isTabBar":true},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black","navigationBarTitleText":"home page"}},{"path":"/pages/forum-detail/forum-detail","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black","navigationBarTitleText":"Community interactive posting details"}},{"path":"/pages/forum-reply/forum-reply","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black","navigationBarTitleText":"Reply to comments"}},{"path":"/pages/forum-list/list","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black","navigationBarTitleText":"My Posts"}},{"path":"/pages/forum-my/forum-my","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black","navigationBarTitleText":"My Posts"}},{"path":"/pages/forum-add-or-update/forum-add-or-update","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black","navigationBarTitleText":"My Posts"}},{"path":"/common/linkOthers/linkOthers","meta":{},"window":{"navigationBarBackgroundColor":"#EEFCFF","navigationBarTextStyle":"black"}}];
__uniConfig.onReady=function(callback){if(__uniConfig.ready){callback()}else{onReadyCallbacks.push(callback)}};Object.defineProperty(__uniConfig,"ready",{get:function(){return isReady},set:function(val){isReady=val;if(!isReady){return}const callbacks=onReadyCallbacks.slice(0);onReadyCallbacks.length=0;callbacks.forEach(function(callback){callback()})}});
__uniConfig.onServiceReady=function(callback){if(__uniConfig.serviceReady){callback()}else{onServiceReadyCallbacks.push(callback)}};Object.defineProperty(__uniConfig,"serviceReady",{get:function(){return isServiceReady},set:function(val){isServiceReady=val;if(!isServiceReady){return}const callbacks=onServiceReadyCallbacks.slice(0);onServiceReadyCallbacks.length=0;callbacks.forEach(function(callback){callback()})}});
service.register("uni-app-config",{create(a,b,c){if(!__uniConfig.viewport){var d=b.weex.config.env.scale,e=b.weex.config.env.deviceWidth,f=Math.ceil(e/d);Object.assign(__uniConfig,{viewport:f,defaultFontSize:Math.round(f/20)})}return{instance:{__uniConfig:__uniConfig,__uniRoutes:__uniRoutes,global:void 0,window:void 0,document:void 0,frames:void 0,self:void 0,location:void 0,navigator:void 0,localStorage:void 0,history:void 0,Caches:void 0,screen:void 0,alert:void 0,confirm:void 0,prompt:void 0,fetch:void 0,XMLHttpRequest:void 0,WebSocket:void 0,webkit:void 0,print:void 0}}}});
