use d2_db;

CREATE TABLE `d2_post` (
  `post_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `body` longtext,
  `publication_date` datetime(6) DEFAULT NULL,
  `social_url` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `view_count` int(11) NOT NULL,
  `category_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`post_id`),
  KEY `FKb2nw8c4208tmmtqu4h1nlillb` (`category_id`),
  CONSTRAINT `FKb2nw8c4208tmmtqu4h1nlillb` FOREIGN KEY (`category_id`) REFERENCES `d2_category` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=669 DEFAULT CHARSET=utf8;

CREATE TABLE `d2_category` (
  `category_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


CREATE TABLE `d2_image` (
  `image_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `path` varchar(255) DEFAULT NULL,
  `image_post_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`image_id`),
  KEY `FK1mhyslpvar0qomxghskk5yecu` (`image_post_id`),
  CONSTRAINT `FK1mhyslpvar0qomxghskk5yecu` FOREIGN KEY (`image_post_id`) REFERENCES `d2_post` (`post_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `d2_member` (
  `member_id` varchar(255) NOT NULL,
  `avatar_url` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `profile` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `d2_posting` (
  `posting_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `posting_member_id` varchar(255) DEFAULT NULL,
  `posting_post_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`posting_id`),
  KEY `FKdx9saq753c0atak8dtelhar6c` (`posting_member_id`),
  KEY `FK8m71sbrix25846sdtl29aw79g` (`posting_post_id`),
  CONSTRAINT `FK8m71sbrix25846sdtl29aw79g` FOREIGN KEY (`posting_post_id`) REFERENCES `d2_post` (`post_id`),
  CONSTRAINT `FKdx9saq753c0atak8dtelhar6c` FOREIGN KEY (`posting_member_id`) REFERENCES `d2_member` (`member_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

CREATE TABLE `d2_post_reply` (
  `reply_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `bad_count` int(11) NOT NULL,
  `comments` varchar(255) DEFAULT NULL,
  `good_count` int(11) NOT NULL,
  `reply_at` datetime(6) DEFAULT NULL,
  `replyer` varchar(255) DEFAULT NULL,
  `text` varchar(255) DEFAULT NULL,
  `post_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`reply_id`),
  KEY `FKhvnf61wqphejmbwouobghtnu7` (`post_id`),
  CONSTRAINT `FKhvnf61wqphejmbwouobghtnu7` FOREIGN KEY (`post_id`) REFERENCES `d2_post` (`post_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `d2_tag` (
  `tag_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `d2_tag_post` (
  `tag_id` bigint(20) NOT NULL,
  `post_id` bigint(20) NOT NULL,
  KEY `FK9wn71qj277bltjk513b46jfrg` (`post_id`),
  KEY `FKf16pqf8roo7usd14mus0ple37` (`tag_id`),
  CONSTRAINT `FK9wn71qj277bltjk513b46jfrg` FOREIGN KEY (`post_id`) REFERENCES `d2_post` (`post_id`),
  CONSTRAINT `FKf16pqf8roo7usd14mus0ple37` FOREIGN KEY (`tag_id`) REFERENCES `d2_tag` (`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
