/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

module com.root101clean.core {
    requires java.validation;
    requires org.hibernate.validator;
    requires org.hibernate.validator.annotationprocessor;
    requires java.desktop;
    requires org.jboss.logging;
    requires com.fasterxml.classmate;
    
    exports com.root101.clean.core.app.modules;
    exports com.root101.clean.core.app.presenters;
    exports com.root101.clean.core.app.repo;
    exports com.root101.clean.core.app.services;
    exports com.root101.clean.core.app.usecase;
    
    exports com.root101.clean.core.domain;
    exports com.root101.clean.core.domain.services;
    exports com.root101.clean.core.exceptions;
}
