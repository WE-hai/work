create user happy@'localhost' identified by '';
grant all on training.user_login to happy@'localhost';
alter user happy@'localhost' identified by '1234';
drop user happy@'localhost';

create database bank_work;
use bank_work;

create table bank_table
(
  id varchar(20) primary key auto_increament comment '流水号',
  user_name varchar(10) coment '姓名',
  user_age int comment '年龄',
  user_no varchar(18) comment '身份证号',
  from_no varchar(18) comment '银行卡号',
  pay_way varchar(5) comment '付款方式',
  money double comment '付款金额',
  to_no varchar(18) comment '付款银行卡号',
  date_time date comment '时间',
  place varchar(50) comment '地点',
  state varchar(3) comment '状态'
);

select id,user_name,from_no,to_no,date_time,money,pay_way from bank_table where money != null or state = '成功';
