package com.example.samplespring.SampleImport;

import com.example.samplespring.SampleImport.A;
import com.example.samplespring.SampleImport.B;
import com.example.samplespring.SampleImport.ConfigB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //eger ConfigB classinda @Import etmeseydim
//        ApplicationContext ctxB = new AnnotationConfigApplicationContext(ConfigB.class);
//        ApplicationContext ctxA = new AnnotationConfigApplicationContext(ConfigA.class);
//        A a = ctxA.getBean(A.class);
//        B b = ctxB.getBean(B.class);
        //bele yazmali idim, hem A hem de B supply olunmali.


        //asagida isee ConfigB classi @import edildikden sonra A clanin supply edilmesine ehtiyac qalmir
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);

        // now both beans A and B will be available...
        A a = ctx.getBean(A.class);
        B b = ctx.getBean(B.class);
    }
}
