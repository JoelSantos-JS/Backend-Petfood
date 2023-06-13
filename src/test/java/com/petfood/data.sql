INSERT INTO location ( lat, len)
VALUES
  ( -13.8583, -40.0836),
  ( -13.8983, -40.0881),
  ( -13.8691, -40.0903),
  ( -13.8866, -40.0975);





INSERT INTO petshop (name, logo, category, emphasis, location_id)
VALUES
  ( 'PetShop Cao e cia', 'https://raw.githubusercontent.com/JoelSantos-JS/PetFood/main/src/assets/pet/pet1.jpg', 'raçao', 'cachorro', 1),
  ( 'PetShop Amigo e cia', 'https://raw.githubusercontent.com/JoelSantos-JS/PetFood/main/src/assets/pet/pet2.webp', 'raçao', 'cachorro', 2),
  ( 'PetShop gatos e cia', 'https://raw.githubusercontent.com/JoelSantos-JS/PetFood/main/src/assets/pet/pet3.avif', 'raçao', 'cachorro', 3),
  ( 'PetShop gatos e dogs', 'https://raw.githubusercontent.com/JoelSantos-JS/PetFood/main/src/assets/pet/pet4.jpg', 'raçao', 'cachorro', 4);




INSERT INTO product (name, cape, price, avaliations)
VALUES
  ( 'Racao Glan Plus', 'https://raw.githubusercontent.com/JoelSantos-JS/PetFood/main/src/assets/racao/racao1.webp', 20.0, '4.8'),
  ( 'Racao Legal', 'https://raw.githubusercontent.com/JoelSantos-JS/PetFood/main/src/assets/racao/racao3.webp', 29.0, '4.6'),
  ( 'Racao gato', 'https://raw.githubusercontent.com/JoelSantos-JS/PetFood/main/src/assets/racao/racao3.webp', 39.0, '4.7'),
  ( 'Racao Origens', 'https://raw.githubusercontent.com/JoelSantos-JS/PetFood/main/src/assets/racao/racao4.webp', 19.0, '4.2');


INSERT INTO tb_product_petshop (product_id, petshop_id) VALUES (1, 1);
INSERT INTO tb_product_petshop (product_id, petshop_id) VALUES (2, 1);
INSERT INTO tb_product_petshop (product_id, petshop_id) VALUES (2, 2);
