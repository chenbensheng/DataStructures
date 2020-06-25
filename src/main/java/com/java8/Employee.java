package com.java8;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Integer no;

    private String Name;


    //toString方法 优化
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{ no=");
        sb.append(this.no);
        sb.append(", Name='");
        sb.append(this.Name);
        sb.append("}");
        return sb.toString();
    }
}
