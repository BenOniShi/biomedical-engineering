$(".nav .cg-nav").autoNav();

jQuery(function ($) {
    $("#login_click").click(function () {
        var lg = $("#login_box");
        lg.fadeIn(500);
    });
    $("#close_top").click(function () {
        $(this).parents("#login_box").fadeOut(500);
    });
});