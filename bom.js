
var one = document.getElementById("hone");
var two = document.getElementById("htwo");
var three = document.getElementById("hthree");
var four = document.getElementById("hfour");
 one.addEventListener('click',()=>{
   newwindow= window.open('', '', 'width=500,height=500');
 });
 two.addEventListener('click',()=>{
    if(newwindow){
   newwindow.close();
    }
 });
 three.addEventListener('click',()=>{
    if (newwindow) {
        newwindow.moveTo(100, 100);
    }
 });
 four.addEventListener('click',()=>{
    if (newwindow) {
        newwindow.resizeTo(250, 250);
    }
 });
