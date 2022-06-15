create table author {
      id int(11) primary key not null auto_increment,
      name varchar(45)
};
create table book {
      id int(11) primary key not null auto_increment,
      name varchar(45),
      author_id int(11)
};