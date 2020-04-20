;(function($){
	$.fn.autoNav=function(opt){
		opt=$.extend(true,{
			width:null,
			navSelector:"li"
		},opt);
		return $(this).each(function(index){
			var $this=$(this),
			width=$this.width(),
			menus=$this.children();
			if(opt.width){
				width=opt.width;
			}
			if(opt.navs){
				menus=$this.children(opt.navSelector);
			}
			var menusWidth=0;
			menus.each(function(){
				menusWidth+=$(this).outerWidth();
			});
			var range=parseInt((width-menusWidth)/(menus.length*2));
			menus.css({
				"padding-left":range,
				"padding-right":range
			});
		});
	};
})(jQuery);