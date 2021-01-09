new VueRouter({});
let vm = new Vue({
    el: '#all',
    data: {
        pageInfo: {},
        params: {},
        areaData: {},

    },
    methods: {
        selectMa: function (pageNum, pageSize) {        //查询所有
            this.params.pageNum = pageNum;
            this.params.pageSize = pageSize;
            axios({
                url: 'market/selectMaAll',
                method: "post",
                data: this.params
            }).then(resp => {
                this.pageInfo = resp.data;
            }).catch(function (error) {
                console.log(error);
            })
        },
        prompt: function (uid) {    //注销功能
            layer.confirm('确定注销吗？', {
                    btn: ['确定', '取消'] //按钮
                }, () => {
                    layer.msg('注销成功', {icon: 1});
                    axios({
                        url: 'market/customerDel',
                        params: {uid: uid}
                    }).then(resp => {
                            this.selectMa();
                        }
                    ).catch(function (error) {
                        console.log(error);
                    })

                }
            );
        },
        approval: function (id) {        //角色分配
            layer.params = id;
            layer.open({
                type: 2,
                title: "角色分配",
                content: "customerApproval",
                area: ["20%", "35%"],
                end: () => {
                    this.selectMa();
                    layer.msg("操作成功")
                }
            })
        },
        userData: function () {

        }
    },
    created: function () {
        this.selectMa();//在vue创建后调用函数返回数据
    }
});

