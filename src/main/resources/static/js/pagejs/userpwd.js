layui.use(['form', 'layuimini'], function () {
    var form = layui.form,
        layer = layui.layer,
        layuimini = layui.layuimini;
    //监听提交
    form.on('submit(saveBtn)', function (data) {
        if (data.field.newPassword!=data.field.againPassword){
            layer.alert('两次密码输入错误,请重新输入');
            return false;
        }
        var index = layer.alert('您确认要修改吗?', {
            title: '修改密码'
        }, function (r) {
            console.log(data.field)
            if (r){
                $.ajax({
                    type:'post',
                    url:'/emp/changePwdForm',
                    data:data.field,
                    dataType:'json',
                    success:function (data) {
                        if (data.code==200){
                            layer.close(index);
                            layuimini.closeCurrentTab();
                        }else{
                            layer.alert(data.msg);
                        }
                    }
                })
            }
        });
        return false;
    });

});



