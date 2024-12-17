import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import discussjiankangzhishiku from '@/views/modules/discussjiankangzhishiku/list'
    import jiankangtixing from '@/views/modules/jiankangtixing/list'
    import shiwuyingyang from '@/views/modules/shiwuyingyang/list'
    import zhishileixing from '@/views/modules/zhishileixing/list'
    import meiriyinshi from '@/views/modules/meiriyinshi/list'
    import mubiaogenzongyubaogao from '@/views/modules/mubiaogenzongyubaogao/list'
    import storeup from '@/views/modules/storeup/list'
    import jiankangxinxi from '@/views/modules/jiankangxinxi/list'
    import forum from '@/views/modules/forum/list'
    import shishibushuhehuodongzhuizong from '@/views/modules/shishibushuhehuodongzhuizong/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import jiankangzhishiku from '@/views/modules/jiankangzhishiku/list'
    import yinshijihua from '@/views/modules/yinshijihua/list'
    import config from '@/views/modules/config/list'
    import jiankangpinggu from '@/views/modules/jiankangpinggu/list'
    import yundongrizhi from '@/views/modules/yundongrizhi/list'
    import yundongjihua from '@/views/modules/yundongjihua/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/discussjiankangzhishiku',
        name: '健康知识库评论',
        component: discussjiankangzhishiku
      }
      ,{
	path: '/jiankangtixing',
        name: '健康提醒',
        component: jiankangtixing
      }
      ,{
	path: '/shiwuyingyang',
        name: '食物营养',
        component: shiwuyingyang
      }
      ,{
	path: '/zhishileixing',
        name: '知识类型',
        component: zhishileixing
      }
      ,{
	path: '/meiriyinshi',
        name: '每日饮食',
        component: meiriyinshi
      }
      ,{
	path: '/mubiaogenzongyubaogao',
        name: '目标跟踪与报告',
        component: mubiaogenzongyubaogao
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/jiankangxinxi',
        name: '健康信息',
        component: jiankangxinxi
      }
      ,{
	path: '/forum',
        name: '社区互动',
        component: forum
      }
      ,{
	path: '/shishibushuhehuodongzhuizong',
        name: '实时步数和活动追踪',
        component: shishibushuhehuodongzhuizong
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/chat',
        name: '健康咨询',
        component: chat
      }
      ,{
	path: '/jiankangzhishiku',
        name: '健康知识库',
        component: jiankangzhishiku
      }
      ,{
	path: '/yinshijihua',
        name: '饮食计划',
        component: yinshijihua
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/jiankangpinggu',
        name: '健康评估',
        component: jiankangpinggu
      }
      ,{
	path: '/yundongrizhi',
        name: '运动日志',
        component: yundongrizhi
      }
      ,{
	path: '/yundongjihua',
        name: '运动计划',
        component: yundongjihua
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
