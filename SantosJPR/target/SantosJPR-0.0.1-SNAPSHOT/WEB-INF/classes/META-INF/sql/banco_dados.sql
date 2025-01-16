CREATE TABLE `credenciais` (
  `id` int(11) NOT NULL,
  `Cargo` varchar(25) NOT NULL
  )
  
  INSERT INTO `credenciais` (`id`, `Cargo`) VALUES
  (1, 'Tecnico IT');
(2, 'Contabilista'),
(3, 'Cozinheira'),
(4, 'Secretaria'),
(5, 'Desenvolvedor'),
(6, 'Motorista');


CREATE TABLE `funcionarios` (
  `id` int(12) NOT NULL,
  `Nome` varchar(60) NOT NULL,
  `Sobrenome` varchar(60) NOT NULL,
  `Email` varchar(40) NOT NULL,
  `Telefone` int(30) NOT NULL,
  `Cargo` varchar(25) NOT NULL,
  `Bairro` varchar(20) NOT NULL,
  `Numero_Casa` varchar(20) NOT NULL,
  `Data_Nascimento` date NOT NULL,
  `Credenciais_id` int(11) NOT NULL
  )
  
  INSERT INTO `funcionarios` (`id`, `Nome`, `Sobrenome`, `Email`, `Telefone`, `Cargo`, `Bairro`, `Numero_Casa`, `Data_Nascimento`, `Credenciais_id`) VALUES
(1, 'Mateus', 'Agusto Timo', 'Timomateus@gmail.com', 833434672, 'Motorista', 'Albazine', '554', '2014-08-10', 1),
(2, 'Anizia', 'Custodio Cao', 'Anizia234@gmail.com', 847234901, 'Tecnico IT', 'Boane', '232', '1999-05-03', 2),
(3, 'Batilio', 'Litolia Nhau', 'Nhaulito12@gmail.com', 829031256, 'Contabilista', 'Djonasse', '743', '1968-09-21', 3),
(4, 'Joazin', 'Agustinho Marronga', 'Marrongazip@gmail.com', 871023777, 'Secretaria', 'Luis Cabral', '123', '2000-05-17', 4),
(5, 'Gribi', 'Zilta Txovo', 'Gribizilta@gmail.com', 855557809, 'Desenvolvedor', 'Nkobe', '798', '1993-06-24', 5);

ALTER TABLE `credenciais`
  ADD PRIMARY KEY (`id`);


  ALTER TABLE `funcionarios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cargo` (`Cargo`);
  
  ALTER TABLE `funcionarios`
  MODIFY `id` int(12) NOT NULL
  
  ALTER TABLE `funcionarios`
  FOREIGN KEY (`Credenciais_id`) REFERENCES `credenciais` (`id`);
