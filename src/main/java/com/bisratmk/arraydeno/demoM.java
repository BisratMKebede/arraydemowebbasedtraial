package com.bisratmk.arraydeno;
/*counts total number of array element and does
* summation , in addition it does mean/average */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class demoM {
    @RequestMapping("/array")
    public String method1(@RequestParam("Num") int n){

        double avrg =0,sum = 0;
       // Scanner s = new Scanner(System.in);
       // n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = n;
            sum = sum + a[i];
            avrg = ((sum)/a.length);
        }
        System.out.println("Sum-"+sum);
        System.out.println("Avrg-"+avrg);

        return "Sum: "+String.valueOf(sum)+ "<br/>" + "Average: " + String.valueOf(avrg);
    }

}
