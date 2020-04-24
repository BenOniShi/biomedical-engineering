//主页js
layui.use(['element', 'layer', 'layuimini'], function () {
    var $ = layui.jquery,
        element = layui.element,
        layer = layui.layer;

    layuimini.init("/manager/managerModuleList");


    $(".login-out").on("click", function () {
        layer.confirm('您确定要退出吗', function (r) {
            if (r) {
                window.location.href = "/login/logout";
            }
        });
    });
});