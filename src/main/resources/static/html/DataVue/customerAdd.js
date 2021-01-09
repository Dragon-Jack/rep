let vm = new Vue({
    el: '#all',
    data: {
        params: {}
    },
    methods: {
        customerAdd: function () {
            axios({
                url: '/market/customerAdd',
                method: "post",
                data: this.params
            }).then(function (resp) {
                layer.msg(resp.data.msg);
            }).catch(function (error) {
                console.log(error);
            })
        }
    },
    created: function () {
    }
});