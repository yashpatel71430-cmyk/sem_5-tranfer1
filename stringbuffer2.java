 class stringbuffer2(String[] args) {

  public static void main(String[] args)
  {
    
    StringBuffer st=new StringBuffer("Good Day");
    System.out.println("Length Capacity" + st.length() + "  "+ st.capacity());
    System.out.println("Index Of" + st.indexOf("o"));
    System.out.println("Last Index Of" + st.lastIndexOf("o"));
      
      System.out.println("Reverse " + st.reverse());
      st.insert(2,"&&");
      System.out.println("After Insert =>" + st);
      
      st=st.delete(2, 5);
      System.out.println("After DEleteion =>" + st);
      
      st.setCharAt(0, 'Z');
      System.out.println("Set Char at =>" + st);
      
      st.deleteCharAt(0);
      System.out.println("After Deletion at position  =>" + st);
      System.out.println("Char "+   st.charAt(0));
           
    }
}