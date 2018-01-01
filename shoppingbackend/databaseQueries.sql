CREATE TABLE category (
	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(255),
	image_url VARCHAR(50),
	is_active BOOLEAN,
	CONSTRAINT pk_category_id PRIMARY KEY (id) 

);

INSERT INTO category(name, description, image_url, is_active) VALUES ('Labtop', 'This is description for mobile ctegory!', 'CAT_Mobile.png', true);
INSERT INTO category(name, description, image_url, is_active) VALUES ('Television', 'This is description for television ctegory!', 'CAT_tv.png', true);