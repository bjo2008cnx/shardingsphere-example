delete FROM `shardingsphere-demo0-master`.user_0 ;
delete FROM `shardingsphere-demo0-master`.user_1;
delete FROM `shardingsphere-demo0-master`.user_2;
delete FROM `shardingsphere-demo0-master`.user_3;

delete FROM `shardingsphere-demo1-master`.user_0;
delete FROM `shardingsphere-demo1-master`.user_1;
delete FROM `shardingsphere-demo1-master`.user_2;
delete FROM `shardingsphere-demo1-master`.user_3;

select count(*)  FROM `shardingsphere-demo0-master`.user_0;
select count(*)  FROM `shardingsphere-demo0-master`.user_1;
select count(*)  FROM `shardingsphere-demo0-master`.user_2;
select count(*)  FROM `shardingsphere-demo0-master`.user_3;

select count(*)  FROM `shardingsphere-demo1-master`.user_0;
select count(*)  FROM `shardingsphere-demo1-master`.user_1;
select count(*)  FROM `shardingsphere-demo1-master`.user_2;
select count(*)  FROM `shardingsphere-demo1-master`.user_3;