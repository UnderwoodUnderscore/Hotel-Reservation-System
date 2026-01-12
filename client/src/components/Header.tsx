import { useState } from 'react';
import Bars from './Menu';
import Item from './Item';

export default function Header() {

    const [showMenuItems, setShowMenuItems] = useState(false);

    const mainMenuItems = [
        <Item text='Home' onClick='' />,
        <Item text='About Us' onClick='' />,
        <Item text='Pages' onClick='' />,
        <Item text='Contact' onClick='' />,
        <Item text='Style Guide' onClick='' />,
        <Item text='Change Log' onClick='' />,
        <Item text='Licensing' onClick='' />,
        <Item text='Instruction' onClick='' />
    ]

    function handleMenu() {
        setShowMenuItems(!showMenuItems);
    }
    
    return (
        <>
            <header className="header">
                <a href=''><i className="fa-solid fa-archway"></i></a>
                <i className="fa-solid fa-bars" onClick={handleMenu}></i>

                {showMenuItems && <Bars list={mainMenuItems} />}
            </header>
        </>
    )
}