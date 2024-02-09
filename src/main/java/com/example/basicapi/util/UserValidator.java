package com.example.basicapi.util;

import com.example.basicapi.constants.FeatureCodeEnum;
import com.example.basicapi.exception.UserException;
import com.example.basicapi.models.UserRequest;

public class UserValidator {

    public static void checkParams(UserRequest request,String featureCode) {
        if(request == null) {
            throw new UserException("User Request Cannot be empty");
        } else {
            if(FeatureCodeEnum.USER_CREATE.equals(featureCode)) {
                validateFields(request, false,true,true,true);
            }
            if(FeatureCodeEnum.USER_REMOVE.equals(featureCode)) {
                validateFields(request, true,false,false,false);
            }
            if(FeatureCodeEnum.USER_UPDATE.equals(featureCode)) {
                validateFields(request, true,true,true,true);
            }
        }
    }

    private static void validateFields(UserRequest request,Boolean isUserIdRequired, Boolean isUsernameRequired,
                                Boolean isPasswordRequired, Boolean isEmailRequired) {
        if(isUserIdRequired && request.getUserId() == null) {
            throw new UserException("UserId cannot be empty");
        }
        if(isUsernameRequired && request.getUsername() == null) {
            throw new UserException("Username cannot be empty");
        }
        if(isPasswordRequired && request.getPassword() == null) {
            throw new UserException("Password cannot be empty");
        }
        if(isEmailRequired && request.getEmail() == null) {
            throw new UserException("Email cannot be empty");
        }
    }
}
