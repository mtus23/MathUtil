/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//netbean>10 add jar tay xóa import + import lại
//java/netbeans/platfrom/module/ext/harmcest-core+junit
import org.junit.Test;
import static org.junit.Assert.*;
import static tus.util.MathUtil.computeFactorial;

/**
 *
 * @author DELL
 */
public class UnitTest {

    //chứa nhiều main, để biến hàm thánh main dùng annotation @Test
    //main chạy tuần tự từ trên xuống
    //k lỗi cú pháp/import ~> clean&build luôn success
    //test xanh mới dc build+clean 
    
    //netbean 8x,1005
    //netbean>10,1204
    public UnitTest() {
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFailCase(){
        //assertEquals so value, exception k phải value
        computeFactorial(-5);
        
    }

    @Test
    public void testSuccessFulcase() {
        assertEquals(120, computeFactorial(5));
        assertEquals(720, computeFactorial(6));

        assertEquals(1, computeFactorial(0));
        assertEquals(1, computeFactorial(1));
        assertEquals(2, computeFactorial(2));


    }
}
