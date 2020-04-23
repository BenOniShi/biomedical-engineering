layui.use(['form', 'layuimini'], function () {
    var form = layui.form,
        layer = layui.layer,
        layuimini = layui.layuimini;

    //监听提交
    form.on('submit(saveBtn)', function (data) {
        var index = layer.alert("您确认要提交吗？", {
            title: '个人资料'
        }, function (r) {
            if (r) {
                $.ajax({
                    type: 'post',
                    url: '/emp/changeEmpDetails',
                    data: data.field,
                    dataType: 'json',
                    success: function (data) {
                        if (data.code == 200) {
                            layer.close(index);
                            layuimini.closeCurrentTab();
                        } else {
                            layer.alert(data.msg);
                        }
                    }
                })
            }
        });
        return false;
    });

});