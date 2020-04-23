
package projectdata;



public class Node {
    
    
    String data;
    Node left;
    Node right;
    
    public Node(String data){
     this.data=data;   
    this.left = this.right = null;
    }
}   
    
//    String dic []={"correctible","fisher-cat","tool-demagnetizer","firstling","prudentiality","nondangerous","limsy","silver-tuned","sea-kindliness","monger"
//
//,"distinguishably","prefertilize","switchman","yarm","schoolyard","bedribble","Ateba","nonexcepted","phasmatrope","odontoid","tallow-face"
//
//,"immense","birdweed","hopoff","Mongolize","net-assets","perfusion","completively","shallowhearted","inure","life-history","ambuling","essayist","suprathoracic"
//
//,"skiametry","town-guard","endorachis","net-silk","phonotypist","tail-pipe","concurringly","uncondensable","little-regarded","Spigelian"
//
//,"unbarreled","clay-tempering","cocuisa","undeparted","six-faced","taboret","lake-moated","philopatrian","degenerately","postatrial"
//
//,"Gaullist","epithelioma","braeface","porridgelike","obituary","unprocessed","acier","Lamium","Lepilemur","hoodlumize","trabant","strong-looking"
//
//,"disincarnation","cameralistic","fluellen","unbuyable","Grendel","paradiplomatic","strawberrylike","misosophist","pseudoetymological"
//
//,"romanticism","segregable","twice-terminated","ploratory","metroclyst","scops-owl","akule","apprehender","Bahima","scrota","bellmaster"
//
//,"exorableness","underworker","spinach-dock","turbid","ten-mile","triglandular","unperjured","twaddling","drainage-pipe","still-burn","reticule","paradenitis","zygadenine"};
    

//    if (tree.flag == true)    
//                {
//                 System.out.println("The word is exist");
//                }
//                else{     
//                       
//          Node s = tree.getSuccessor(tree.root,tree.x.data);
//          Node v = tree.getPredcessor(tree.root,tree.x.data);
//          System.out.println("The Sugesstions of the word ....."+"The Successor is  "+s.data+"The Predcessor is  "+v.data + "The leaf Node is  " + tree.x.data);
//          System.out.println("The word has been added");
//              }               
//                      break; 


//      public void se(Node root,String key){
//        if (root==null){
//       System.out.println("not found");
//       is =false;
//}
//        else if (key.compareToIgnoreCase(root.data)==0){
//        System.out.println("found");
//        is =true;
//        }
//       else if (key.compareToIgnoreCase(root.data)>0){
//        se(root.left,key);
//       }
//       else if (key.compareToIgnoreCase(root.data)<0)  
//        se(root.right,key);             
// if (!is)
//     add(key);
//}



//        
//       Node c =getSuccessor(root,(x.data));   
//        Node b =getSuccessor(root,(x.data));
//        
//          
//            
//        
//           
//        System.out.println(c.data);
//        System.out.println(b.data);            
//        System.out.println(x.data); 



//   
//          
//          Node v = tree.getSuccessor(tree.root, (tree.root.data));
//            Node y = tree.getSuccessor(tree.root, (tree.root.data));        
//  System.out.println(v.data);
//  System.out.println(y.data);
//System.out.println(tree.root.data);
//   Node s = tree.getSuccessor(tree.root, (tree.root.data));
//if (s==null)
//    System.out.println("no sucssesor found");
//else
//    System.out.println("found   " + s.data);
//
//Node v = tree.getPredcessor(tree.root, (tree.root.data));
//if (v==null)
//    System.out.println("no sucssesor found");
//else
//    System.out.println("found   " + v.data);



//   case 11 :
//                      tree.add("hello");
//                      tree.add("baba");
//                      tree.add("mama");
//                      tree.add("halaloia");
//                      tree.add("mlh");
    
  
     
//     public void getSuccessor(Node node , String data){  
//       Node temp ;  
////    Node current = searchh(root,data);   
////      if (current == null)
////          return null;   
//      if (node.right != null)
//      {
//          temp = node.right;
//      
//      while(temp.left != null){
//       temp = temp.left;   
//      }
//        succ = temp.data;
////        return succ;
//      }   
//      else{
//          
//       Node successor = null;   
//       Node ancestor = root;
//       
//       while (ancestor != node )
//       {
//        if (node.data.compareTo(ancestor.data) < 0 )   
//        {
//         successor = ancestor;   
//         ancestor = ancestor.left;
//        }
//        else
//        {
//         ancestor = ancestor.right;   
//        }   
//       }
//       succ = successor.data;   
////       return succ;
//      }
//         
//     }
//     
//     public void getPredcessor(Node node , String data){
//         
//      Node temp ;  
////      Node current = searchh(root,data);   
//          
////      if (current == null)
////          return null;
//      
//      if (node.left != null)
//      {
//          temp = node.left;
//      
//      while(temp.right != null){
//       temp = temp.right;   
//      }
//       pred = temp.data;
////        return pred;
//      }    
//      else{
//          Node predcessor = null;
//          Node ancestor = root;
//          
//          while (ancestor != node)
//          {
//           if (node.data.compareTo(ancestor.data)> 0)   
//           {
//            predcessor = ancestor;   
//            ancestor = ancestor.right;
//           }
//           else    
//           {
//              ancestor = ancestor.left;
//           }
//          
//          }
//           pred = predcessor.data;
////        return pred;    
//      }
//     }
//     
       

 //  public Node searchkey(Node root,String key){
//        if (root==null){
//       is =false;
//            return root;
//}
//        else if (key.compareToIgnoreCase(root.data)==0){
//        System.out.println("found");
//        is =true;
//        }
//       else if (key.compareToIgnoreCase(root.data)<0){
//        searchkey(root.left,key);
//       }
//       else if (key.compareToIgnoreCase(root.data)>0)  
//        searchkey(root.right,key);             
// if (!is){
//     System.out.println("Not found");
//     add(key);
//     return root;
// }
// return root;
//}
//    
//    public void search5ra(Node root,String key){
//
//        if (root==null){
//
//            System.out.println("not found");
//
//       is =false;
//
//       Search=root;
//
//       return;
//
//}
//
//        else if (key.compareToIgnoreCase(root.data)==0){
//
//        System.out.println("found");
//
//        is =true;
//
//        }
//
//       else if (key.compareToIgnoreCase(root.data)<0){
//
//        search5ra(root.left,key);
//
//       }
//
//       else if (key.compareToIgnoreCase(root.data)>0)  
//
//        search5ra(root.right,key); 
//
//       else 
//
//           Search =root;
//
// if (!is){
//     
//System.out.println("not found");
//     add(key);
//
// }
//
//}


    
    
// 
        
    
//        public void searchs(Node root,String key){
//
//        if (root==null){
//
//            System.out.println("not found");
//
//       is =false;
//
//       Search=root;
//
//       return;
//
//}
//
//        else if (key.compareToIgnoreCase(root.data)==0){
//
//        System.out.println("found");
//
//        is =true;
//
//        }
//
//       else if (key.compareToIgnoreCase(root.data)<0){
//
//        searchs(root.left,key);
//
//       }
//
//       else if (key.compareToIgnoreCase(root.data)>0)  
//
//        searchs(root.right,key);             
//
// if (!is){
//     System.out.println("Not found");
//     
//     add(key);
//
// }
//
//}

 //public void searchAndInsert(String data , Node node){
//        
//         n = searchyaba(data,root);
//        
//       if (is == false) {
//        
//     System.out.println( "Do you mean "+n);
//   
//      System.out.println("Successor  "+succ);
//      System.out.println("Predcessor  "+pred);   
//      add(data);
//       }
//     
////        return node;
//       
//  }
    
    
    
    
     
//    
//    
//    
//    public Node search(String data , Node node){
//        
//        if (node == null){
//            return null;
//        }        
//        if (data.compareTo(node.data)==0){
//           System.out.println("The word " +data+ " is Found");
//           return node;
//        }
//            if (data.compareTo(node.data)>0&& node.right != null ){
//                
//            x =  search(data,node.right);
//              
//        } 
//            else if (data.compareTo(node.data)<0&& node.left != null ){
//           
//         x =   search(data,node.left);   
//        
//             }
//                  if ((node.right == null && node.left == null ) || (node.left == null && data.compareTo(node.data) < 0) || ( node.right == null  && data.compareTo(node.data) > 0))            
//             
//        {        
//                        
//            System.out.println("the word "+data+ " isnot found");      
//            System.out.println("the word has been added");
//            add(data);            
//        } 
//            
//
//            
//     return x;  
//    }
//
//       


    

//         public void SuccandPred(Node node,String data){
//          
//       if (node != null){   
//           if (node.data.compareTo(data)==0){
//               
//               if (node.left != null){
//                 Node  z = node.left;
//               while(z.right != null){
//                   z = z.right;
//               }
//               pred = z.data;
//               }
//               if (node.right != null){
//           Node  y = node.right;
//               while(y.left != null){
//                y = y.left;   
//               }
//          succ = y.data;
//               }
//           }
//           else if (node.data.compareTo(data)>0){
//               succ = root.data;
//              SuccandPred(node.left, data);
//           }
//             else if (node.data.compareTo(data)<0){
//               pred = root.data;
//              SuccandPred(node.right, data);
//           }
//              }
//
//      }

