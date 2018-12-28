/**
 * 
 */
window.onload=function(){
	if(document.getElementById("nav").clientHeight>document.getElementById("section").clientHeight)
	{	
	document.getElementById("section").style.height = document.getElementById("nav").offsetHeight+"px";
	}
	else document.getElementById("nav").style.height = document.getElementById("section").offsetHeight+"px";
}