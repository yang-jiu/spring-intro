package hello.hellospring.service;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.JpaMemberRepository;
import hello.hellospring.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Autowired
    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

//    @Bean
//    public TimeTraceAop timeTraceAop(){
//        return new TimeTraceAop();
//    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

//    @Bean
//    public MemberRepository memberRepository(){
//        //return new MemoryMemberRepository();
//        //return new JdbcMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//    }

}
