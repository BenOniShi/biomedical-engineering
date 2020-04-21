$(function () {
    $(".catalogList li").children("a").click(function () {
        $(this).next(".secondCatalog").toggle();
        console.log("ok")
        //return false;
    })
})
