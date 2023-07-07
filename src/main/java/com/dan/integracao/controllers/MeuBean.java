package com.dan.integracao.controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller //substitui @ManagedBean. Aqui poderia usar também @Component
@Scope("view")//substitui @ViewScope
public class MeuBean {

    public String getMsg() {
        return  "Olá! Estou usando JSF integrado com Spring, com a ajuda do Joinfaces.";
    }

}
