//题目：删数

// 有一个数组a[N]顺序存放0~N-1，要求每隔两个数删掉一个数，到末尾时循环至开头继续进行，
// 求最后一个被删掉的数的原始下标位置。以8个数(N=7)为例:｛0，1，2，3，4，5，6，7｝，
// 0->1->2(删除)->3->4->5(删除)->6->7->0(删除),如此循环直到最后一个数被删除。
//输入描述：
//每组数据为一行一个整数n(小于等于1000)，为数组成员数,如果大于1000，则对a[999]进行计算。
//输出描述：
//一行输出最后一个被删掉的数的原始下标位置。
//示例1:输入 8
//      输出 6

//=》题目解析：这个题目我相信童鞋们应该可以读的懂，其实就是相当于这样的一个游戏：
//     n个人围成一圈，开始报数，报数为3的退出。问存活的是谁？虽然这两个题不能等价，
//     但是考的知识点差不多。
//=》解题思路：这里我们用到了集合ArrayList，当然你也可以使用其他的集合。存放n个数，
//    且都是从0到n-1的数字。因为每次删除的都是当前位置的后面第2个，那么我们就可以这样写：
//   (i+2)%size; 当i==0的时候，我们移除的就是2号下标，接着需要移除4号下标，那么新的
//   i =(i+2)%size; 那么结束条件应该是什么？我们要找到存活的，
//    显而易见当集合的size等于1的时候停止删除。
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day8_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        int j=0;
        while (list.size()>1){
            j=(j+2)%list.size();
            list.remove(j);
        }
        System.out.println(list.get(0));
    }
}
