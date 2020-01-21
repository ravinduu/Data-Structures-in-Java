import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Tree{
  private Node root = null;
  private static int level = 0;

  public void insert(char data){
    if(root == null){
      root = new Node(data);
      return;
    }
    insert(root, new Node(data));
  }
  private static void insert(Node node, Node newNode){
    if(node.getData() <= newNode.getData()){
      if(node.right == null) node.right = newNode;
      else insert(node.right,newNode);
    }
    else {
      if(node.left == null) node.left = newNode;
      else insert(node.left,newNode);
    }
  }

  public void DFS(char data){
    if(root == null) return;
    DFS(root, data);
  }
  private static void DFS(Node node,char data){
    Stack<Node> s = new Stack<Node>();
    Node temp = null;
    s.push(node);
    System.out.println("\nDFS for : "+data);

    while(!s.isEmpty()){
      temp = s.pop();
      if(temp.getData() == data){
        System.out.print(temp.getData());
        break;
      }

      System.out.print(temp.getData()+"->");
      if(temp.right != null) s.push(temp.right);
      if(temp.left != null) s.push(temp.left);
    }
    System.out.println();
  }

  public void BFS(char data){
    if(root == null) return;
    BFS(root, data);
  }
  private static void BFS(Node node,char data){
    Queue<Node> q = new LinkedList<Node>();
    Node temp = null;
    q.add(node);
    System.out.println("\nBFS for : "+data);

    while(!q.isEmpty()){
      temp = q.remove();
      if(temp.getData() == data){
        System.out.print(temp.getData());
        break;
      }

      System.out.print(temp.getData()+"->");
      if(temp.left != null) q.add(temp.left);
      if(temp.right != null) q.add(temp.right);
    }
    System.out.println();
  }
}
