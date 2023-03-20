/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

/**
 *
 * @author Paraiso_ICS104
 */
public class BST {
    /*  **insert
        traverse
            pre-order
            **in order
            post order
            level order??????
        search
    */
    static BTNode root = null;
    
    public void insert(int o){
        // if x<node go to lson else goto rson
        BTNode n = new BTNode(o);
        if(root == null){
            root = n;
        }else{
            BTNode temp = root;
            boolean isInserted=false;
            while(!isInserted){
                if(n.info < temp.info){
                    //goto left
                    if(temp.lson==null){
                        temp.lson = n;
                        isInserted = true;
                    }else{
                        temp = temp.lson;
                    }
                }else if(n.info > temp.info){
                    //goto right
                    if(temp.rson==null){
                        temp.rson = n;
                        isInserted = true;
                    }else{
                        temp = temp.rson;
                    }
                }else{
                    System.out.println("element " + n.info + "  already in the Tree");
                    isInserted = true;                    
                }    
            } 
        }        
    }
    
    
    private String inOrder(BTNode temp){
        String result = "";
        
        //traverse left
        if(temp.lson != null){
            result += inOrder(temp.lson);
        }
        //tranver node
        result += temp.info + ", ";
        
        //traverse right
        if(temp.rson != null){
            result += inOrder(temp.rson);
        }
        
        return result;
    }
        private String preOrder(BTNode temp){
        
        
         String result = "";
         result += temp.info + ", ";
        //traverse left
        if(temp.lson != null){
            result += preOrder(temp.lson);
        }
      
       
        
        //traverse right
        if(temp.rson != null){
            result += preOrder(temp.rson);
        }
        
        return result;
    }
        
        
        public String PostOrder(BTNode temp){
             String result = "";
        
        //traverse left
        if(temp.lson != null){
            result += inOrder(temp.lson);
        }
        //tranver node
        
        
        //traverse right
        if(temp.rson != null){
            result += inOrder(temp.rson);
        }
        result += temp.info + ", ";
        return result;
        }
        
        
        public String traverPostOrder(){
            return PostOrder(root);
        }
     public String traverPreOrder(){
         return preOrder(root);
     }
    
    public String traverInOrder(){
        return inOrder(root);
    }
    
    public boolean search(int val){
        BTNode temp = root;
        
          boolean search = false;
          if ( temp == null){
              return false;
          }while(temp != null){
              if(val< temp.info){
                  temp = temp.lson;
                  
              }else if ( val >temp.info){
                  temp = temp.rson;
                  
              }else {
                  search = true;
                  break;
                  
              }
        
       
       
    }
     return search;

    }
}
   

    

