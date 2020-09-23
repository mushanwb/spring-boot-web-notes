create table user (
    id bigint primary key auto_increment,
    name varchar (100)
);

create table match (
    id bigint primary key auto_increment,
    user_id bigint,
    score int
);

insert into user (id, name) values (1, '张三'), (2, '李四'), (3, '王五');

insert into match(id, user_id, score) values (1, 1, 1000), (2, 1, 2000), (3, 2, 500), (4, 2, 3000),
                                             (5, 3, 2000), (6, 3, 1000), (7, 1, 1000);