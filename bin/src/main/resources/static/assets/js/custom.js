/*
Theme Name: Flapartment - Real Estate HTML5 Template.
Author: Slidesigma
Author URL: https://themeforest.net/user/slidesigma
Version: 1.0.0
*/
(function ($) {
  'use strict';
  // preloader
  	$(window).on('load', function(){
      $('.preloader').hide();
      $('.loader').removeClass();
      $('html').addClass('overflow');
    });
  	// navigation
  	$('.menu-item-has-children>a').append('<span class="arrow"></span>');
  	$('.menu-item-has-megamenu>a').append('<span class="arrow"></span>');
  //mobile nav
  	$(document).ready(function(){
	    $(".hamburger-menu").click(function(){
	    	$(".menu-btn").toggleClass("active");
	    	$(".navigation").toggleClass("active");
	    	$("body").toggleClass("menu-open");
	    	$('html').toggleClass('overflow');
		});
		$(".float-btn-inner").click(function(){
	    	$(".map-search-box").toggleClass("active");
		});
	});
	$(document).ready(function () {
	    $('.main-menu li.menu-item-has-children>a, .main-menu li.menu-item-has-megamenu>a').on('click', function () {
	      $(this).removeAttr('href');
	      var element = $(this).parent('li');
	      if (element.hasClass('open')) {
	        element.removeClass('open');
	        element.find('li').removeClass('open');
	        element.find('ul, .megamenu').slideUp();
	      } else {
	        element.addClass('open');
	        element.children('ul, .megamenu').slideDown();
	        element.siblings('li').children('ul, .megamenu').slideUp();
	        element.siblings('li').removeClass('open');
	        element.siblings('li').find('li').removeClass('open');
	        element.siblings('li').find('ul, .megamenu').slideUp();
	      }
	    });
	});
	$(function(){
    if($('body').is('#homepage-with-map')){
    	$(window).on('load', function(){
	      $('body').addClass('navigation-bottom');
	      if ($('body').hasClass('navigation-bottom')){
		    $('.main-menu li.menu-item-has-children').addClass('nav-postion');
		  } else {
		    $('.main-menu li.menu-item-has-children').removeClass('nav-postion');
		  }
		  
	    });
	    $(window).scroll(function(){
		    if ($(window).scrollTop() >= 800) {
		        $('.menu-style').addClass('fixed-header');
		        $('.topbar').addClass('fixed-top');
		    }
		    else {
		        $('.menu-style').removeClass('fixed-header');
		        $('.topbar').removeClass('fixed-top');
		    }
		    if ($('.menu-style').hasClass('fixed-header')){
		    	$('body').removeClass('navigation-bottom');
		    	$('.main-menu li.menu-item-has-children').removeClass('nav-postion');
			 } else {
			    $('body').addClass('navigation-bottom');
			    $('.main-menu li.menu-item-has-children').addClass('nav-postion');
			 }
		});

		}
	});

    // back to top
	var offset = 220;
		var duration = 500;
		$(window).on('scroll', function() {
		    if ($(this).scrollTop() > offset) {
		        $('.back-top').fadeIn(duration);
		    } else {
		        $('.back-top').fadeOut(duration);
		    }
		});

		$('.back-top').on('click', function(event) {
		    event.preventDefault();
		    $('html, body').animate({scrollTop: 0}, "slow");
		    return false;
		});

		if($(window).scrollTop() > offset) {
		    $('.back-top').fadeOut(0);
		}
		$('a[href="#"]').click(function(e) {
		    e.preventDefault ? e.preventDefault() : e.returnValue = false;
	});

	$(function () {
        if ($('div').is('.property-list-view')) {
          const slider = document.querySelector(".property-feature");
          let isDown = false;
          let startX;
          let scrollLeft;
          slider.addEventListener("mousedown", e => {
            isDown = true;
            slider.classList.add("active");
            startX = e.pageX - slider.offsetLeft;
            scrollLeft = slider.scrollLeft;
          });
          slider.addEventListener("mouseleave", () => {
            isDown = false;
            slider.classList.remove("active");
          });
          slider.addEventListener("mouseup", () => {
            isDown = false;
            slider.classList.remove("active");
          });
          slider.addEventListener("mousemove", e => {
            if (!isDown) return;
            e.preventDefault();
            const x = e.pageX - slider.offsetLeft;
            const walk = x - startX;
            slider.scrollLeft = scrollLeft - walk;
          });
        }
    });
    // time counter
	function makeTimer() {
		var endTime = new Date("01 January 2021 00:00:00 GMT+05:30");
		endTime = (Date.parse(endTime) / 1000);
		var now = new Date();
		now = (Date.parse(now) / 1000);
		var timeLeft = endTime - now;
		var days = Math.floor(timeLeft / 86400);
		var hours = Math.floor((timeLeft - (days * 86400)) / 3600);
		var minutes = Math.floor((timeLeft - (days * 86400) - (hours * 3600)) / 60);
		var seconds = Math.floor((timeLeft - (days * 86400) - (hours * 3600) - (minutes * 60)));
		if (hours < "10") {
			hours = "0" + hours;
		}
		if (minutes < "10") {
			minutes = "0" + minutes;
		}
		if (seconds < "10") {
			seconds = "0" + seconds;
		}
		$("#cvdays").html(days);
		$("#cvhours").html(hours);
		$("#cvminutes").html(minutes);
		$("#cvseconds").html(seconds);
	}
	setInterval(function () {
		makeTimer();
	}, 1000);
	
})(jQuery);