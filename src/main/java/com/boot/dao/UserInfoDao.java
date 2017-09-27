package com.boot.dao;

import com.boot.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mr on 2017/8/22.
 */
public interface UserInfoDao extends JpaRepository<UserInfo,Long> {
}
