//
// Use `record` instead of legacy DTO.
//

//package com.template.tspringbootjava.dto.root;
//
//import lombok.Getter;
//import lombok.experimental.SuperBuilder;
//
//import java.time.Instant;
//
//public interface RootDto {
//
//    @Getter
//    @SuperBuilder
//    class HealthcheckResponseDto {
//        String status;
//    }
//
//    @Getter
//    @SuperBuilder
//    class InformationResponseDto {
//        BuildInformation build;
//        GitInformation git;
//    }
//
//    @Getter
//    @SuperBuilder
//    class BuildInformation {
//        String name;
//        String version;
//        Instant time;
//        String profile;
//    }
//
//    @Getter
//    @SuperBuilder
//    class GitInformation {
//        String branch;
//        GitCommit commit;
//    }
//
//    @Getter
//    @SuperBuilder
//    class GitCommit {
//        String id;
//        Instant time;
//    }
//
//}
