document.write("*関数*");
document.write("<br>");
document.write("<br>");
document.write("問１");
document.write("<br>");
document.write("実行結果");
document.write("<br>");

function total(han,en=3.14){
return han*han*en;
}
document.write(total(5));
document.write("<br>");
document.write(total(7));
document.write("<br>");
document.write(total(10));
document.write("<br>");



document.write("<br>");
document.write("問2");
document.write("<br>");
document.write("実行結果");
document.write("<br>");
document.write("<br>");

function goukei(adult,child,gru,adultmn=500,childmn=200){
return gru+"の合計金額"+(adult*adultmn+child*childmn);
}
document.write(goukei(2,4,"A")+"<br>");
document.write(goukei(1,5,"B")+"<br>");
document.write(goukei(3,7,"c")+"<br>");

