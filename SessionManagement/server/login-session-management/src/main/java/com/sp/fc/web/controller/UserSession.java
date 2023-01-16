package com.sp.fc.web.controller;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserSession {

    private String username;
    private List<SessionInfo> sessions;

    public int getCount(){
        return sessions.size();
    }
}
