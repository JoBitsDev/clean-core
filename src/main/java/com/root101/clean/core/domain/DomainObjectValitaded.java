/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.root101.clean.core.domain;

import com.root101.clean.core.exceptions.ValidationException;
import com.root101.clean.core.utils.validation.Validable;
import com.root101.clean.core.utils.validation.ValidationResult;

/**
 *
 * JoBits
 *
 * @author Jorge
 *
 */
public class DomainObjectValitaded extends DomainObject implements Validable {

    @Override
    public ValidationResult validate() throws ValidationException {
        ValidationResult v = new ValidationResult();
        v.checkFromAnnotations(this);
        return v.throwException();
    }
}
