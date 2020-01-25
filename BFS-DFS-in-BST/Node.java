public class Node{
  private char data;
  protected Node left;
  protected Node right;
  
  public Node(char data){ //constructor for new node
    this.data = data;
  }
  
  public char getData(){ //getter for retrieve data
    return this.data;
  }
}