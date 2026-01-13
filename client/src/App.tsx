import { useState } from 'react';
import Intro from './components/Intro';
import Form from './components/Forms';
import MainContent from './components/MainContent';

export default function Page() {

	const showLogin = false;
	const loggedIn = true;
	
	let landing = (
		<>
			{/* <Header /> */}
			<Intro headerText='Find Your Perfect Place to Stay' descText='Conveniently aggregate interoperable value after cross functional innovation. Enthusiastically transition innovative web services before future-proof.' />
			<Form type='booking' />
		</>
	)

	return (
		<>
			{showLogin && <Form type='login' />}
			{loggedIn && <MainContent />}
		</>
	)
}