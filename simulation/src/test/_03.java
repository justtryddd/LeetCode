package test;

/**
 * @date 2022/3/25 - 22:26
 *  singleLinklist
 */
public class _03 {
    public static void main(String[] args) {

        HeroNode staff1 = new HeroNode(1,"王a","Wa");
        HeroNode staff2 = new HeroNode(2,"王b","Wb");
        HeroNode staff3 = new HeroNode(3,"王c","Wc");
        HeroNode staff4 = new HeroNode(4,"王d","Wd");

        SingleLinklist singleLinklist = new SingleLinklist();
/*无序添加节点
    singleLinklist.addHeroNode(staff1);
    singleLinklist.addHeroNode(staff3);
    singleLinklist.addHeroNode(staff4);
    singleLinklist.addHeroNode(staff2);
    */

/*按顺序添加节点
    singleLinklist.addHeroNode(staff1);
    singleLinklist.addHeroNode(staff3);
    singleLinklist.addHeroNode(staff4);
    singleLinklist.addHeroNode(staff2);
*/
        singleLinklist.addHeroNode(staff1);
        singleLinklist.addHeroNode(staff3);
        singleLinklist.inserOrderNode(staff4);
        singleLinklist.inserOrderNode(staff2);

        System.out.println("显示链表：");
        singleLinklist.list();
        System.out.println("修改后的链表：");
        singleLinklist.update(1);
        singleLinklist.list();

        System.out.println("删除后的链表");
        singleLinklist.delete(1);
        singleLinklist.list();
        System.out.println("-------------------");

//
//        head.next = new HeroNode(1,"w","q");
//        head.next.next = new HeroNode(2,"w","q");
//        head.next.next.next = new HeroNode(3,"w","q");
//        System.out.println(head);

    }
}

class HeroNode{
    private int no;
    private String name;
    private String nickname;
    public HeroNode next;

    public HeroNode(int no,String name,String nickname){
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname  + "'}'";
    }
}

class SingleLinklist {      //创建单链表，管理链表
    private HeroNode head = new HeroNode(0,"","");//创建头节点，不存放任何数据

    public void addHeroNode(HeroNode heroNode){     //添加一个新节点
        HeroNode temp = head;
        while(true){        //while循环找到当前列表的最后节点
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;       //将传进来的heroNode加入到列表中
    }
    public void list(){         //遍历出链表所有节点
        if(head.next == null){
            System.out.println("这是个空链表");
            return;
        }
        HeroNode temp = head.next;
        while(true){
            if(temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
    public void inserOrderNode(HeroNode node){
        HeroNode temp = head;
        boolean flag = false;
        while(true){
            if(temp.next == null){
                break;
            }
            if(temp.next.getNo() == node.getNo()){
                flag = true;
                break;
            }
//            if(temp.getNo() < node.getNo() && temp.next.getNo() > node.getNo())  //指针一直在递增，故没必要&&
            if( temp.next.getNo() > node.getNo()){
                 break;
            }
            temp = temp.next;
        }
        if(flag){
            System.out.println(node.getNo() + "编号节点已存在，不能添加");
        }
        //不太好理解，先让新节点与temp.next相连，再把新节点放在temp.next的位置，反向的话temp.next就是新节点，矛盾！
        node.next = temp.next;
        temp.next = node;
    }
    public void update(int no){
        HeroNode temp = head;
        boolean flag = false;
        while(true){
            if(temp.next.getNo() == no){
                break;
            }
            if(temp.next == null){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            System.out.println("没有发现该节点");
        }
        temp.next.setName("GYB");
        temp.next.setNickname("gyb");
    }
    public void delete(int no){
        HeroNode temp = head;
        boolean flag = false;
        while(true){
            if(temp.next == null){
                flag = true;
                break;
            }
            if(temp.next.getNo() == no){
                break;
            }
            temp = temp.next;
        }
        if(flag){
            System.out.println("未发现该节点");
        }
        temp.next = temp.next.next;
    }
}
