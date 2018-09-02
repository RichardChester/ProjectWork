import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Create_account from '@/components/Create_account'
import GetAccount from '@/components/GetAccount'

Vue.use(Router);

export default new Router({
    routes: [
        {
            path: '/',
            name: 'HelloWorld',
            component: HelloWorld
        },
        {
            path: '/CreateAccount',
            name: 'Create_account',
            component: Create_account
        },
        {
            path: '/GetAccount',
            name: 'GetAccount',
            component: GetAccount
        }
    ]
})