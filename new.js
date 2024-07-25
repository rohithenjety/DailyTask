document.getElementById("suii").innerHTML ="page location is "+  window.location.port;
document.getElementById("suii").innerHTML = "your history forward " + window.history.back();

var btns=document.getElementById("btn");
btns.addEventListener('click',()=>{
    setTimeout(rohith, 2000);
});
function rohith(){
    alert("rohith");
}
