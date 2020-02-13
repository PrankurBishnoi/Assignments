str=(prompt("Enter a string to be checked as a palindrome",""));
l=str.length;
c=0;
for(i=0,j=l-1;i<=l/2;i++,j--)
{
    if(str.charAt(i)!=str.charAt(j))
    {
        c=1;
        break;
    }
}

if (c===1) 
{
    alert("is not Palindrome");    
}
else
{
    alert("is Palindrome");
}