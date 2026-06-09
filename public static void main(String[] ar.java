class stringbuffer(String[] args){

StringBuffer st=new StringBuffer(str:"Good Day");
System.out.println("Length Capacity" + st.length() +" "+ st.capacity());
System.out.println("Index of" + st.indexof(str: "o"));
System.out.println("Last Index of" + st.lastindexof(str: "o"));

System.out.println("reverse " + st.reverse());

st.insert(offset:2,str: " &&");
System.out.println("After insert =>" +st);

st=st.delete(start:2, end:5);
System.out.println("After deleteion =>" + st);

st.setcharat(index: 0, ch: 'z');
System.out.println("set char at =>" + st);

st.deletecharat (index:0);
System.out.println("After deletion at position =>" + st);
System.out.println("char"+ st.charat(index:0));
}
}