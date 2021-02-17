package com.company;

import lombok.Getter;
import lombok.Setter;


public class MobilePhone {

    private @Setter @Getter String m_brand;
    private @Setter @Getter String m_model;
    private @Setter @Getter int m_price;
    private @Setter @Getter double m_size;
    private @Setter @Getter String m_color;

    public MobilePhone(String m_brand, String m_model, int m_price, double m_size) {
        this.m_brand = m_brand;
        this.m_model = m_model;
        this.m_price = m_price;
        this.m_size = m_size;
    }

    public MobilePhone(String m_brand, String m_model, int m_price) {
        this(m_brand, m_model, m_price, 5.4);
    }

    public MobilePhone(String m_brand, String m_model) {
        this(m_brand, m_model, 54);
    }
    public  MobilePhone () {
        this("ferrari", "testa rocca", 50, 5.4);
    }
}


