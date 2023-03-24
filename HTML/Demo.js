function msg()
{
    var names=document.getElementById("name1").value ;
    var psw=document.getElementById("psw1").value;
   if(names==null || names=="") 
   {
    alert("name cannot be empty");
    
   }
  else if(psw.length<6)
  {
    alert("passowrd should be max greater than 5");
    
  }
   
   
}