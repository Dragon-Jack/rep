let vm = new Vue({
    el: '#all',
    data: {
        uid: {},            //用户id
        params: {},        //姓名
        listData: {},   //所有admin
        position: {}     //职位
    },
    methods: {
        selectAll: function () {

            axios({
                url: '/market/selectAdmin',
                params: {position: this.position}
            }).then(resp => {
                this.listData = resp.data;
            }).catch(function (error) {
                console.log(error);
            })
        },
        add: function () {
            axios({
                url: "/market/addPosition",
                params: {id: this.uid, name: this.params.name}
            }).then(resp => {
                let index = parent.layer.getFrameIndex(window.name);
                parent.layer.close(index);
            })
        }
    },
    created: function () {
        this.selectAll();//在vue创建后调用函数返回数据
        this.uid = parent.layer.params;

    }
});