package com.league.blockmanager.repository;

import com.league.blockmanager.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByName(String name);

    /**
     *  查询同一个联盟内，除自己外其他的所有节点
     * @param groupId
     * @param id  自己节点id
     * @return    成员集合
     */
    List<Member> findByGroupIdAndAppIdNot(String groupId, String id);

    /**
     *  查询某个节点
     * @param appId
     * @return    Member
     */
    Member findFirstByAppId(String appId);

    /**
     *   查询一个联盟内所有节点
     * @param groupId
     * @return   成员集合
     */
    List<Member> findByGroupId(String groupId);

    /**
     *  根据机构名查询
     * @param name
     * @return   Member
     */
    Member findFirstByName(String name);
}
