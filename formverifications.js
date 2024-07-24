document.getElementById("forms").addEventListener("submit",()=>{
    var name= document.getElementById("name").value.trim()
    if(name===""){
     alert("fill the name");
     event.preventDefault();
    }
 });